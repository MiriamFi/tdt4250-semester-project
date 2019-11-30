package imdb.odesign;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.eclipse.emf.ecore.EObject;

import imdb.Episode;
import imdb.Imdb;
import imdb.ImdbFactory;
import imdb.Title;
import imdb.TitleType;
import imdb.TitleTypeWrapper;
import imdb.TvSeries;

/**
 * The services class used by VSM.
 */
public class Services {

	/**
	 * See http://help.eclipse.org/neon/index.jsp?topic=%2Forg.eclipse.sirius.doc%2Fdoc%2Findex.html&cp=24 for documentation on how to write service methods.
	*/
	public EObject myService(EObject self, String arg) {
		// TODO Auto-generated code
		return self;
    }
    

    
    public Collection<Episode> getSeasons(EObject self){
    	Map<Integer, Episode> seasons = new HashMap<Integer, Episode>();
    	
    	if( !(self instanceof TvSeries)) {
    		return seasons.values();
    		
    	}
    	for(Episode episode : ((TvSeries) self).getEpisodes()) {
    		int season = episode.getSeasonNumber();
    		if(!seasons.containsKey(season)){
    			seasons.put(season, episode);
    		}
    	}
    	return seasons.values();
    }
    
    public List<Episode> getEpisodes (EObject self){
    	List<Episode> episodes = new ArrayList<Episode>();
    	if( !(self instanceof Episode)) {
    		return episodes;
    	}
    	Episode episode  = (Episode) self;
    	for(Episode e: episode.getSeries().getEpisodes()) {
    		if(e.getSeasonNumber() == episode.getSeasonNumber()) {
    			episodes.add(e);
    		}
    	}
    	return episodes;
	}

	public Collection<TitleTypeWrapper> getAvailableTitleTypes(Imdb self) {
		return self.getTitles().stream()
				.map(title -> title.getTitleType()).distinct()
				.map(type -> {
					TitleTypeWrapper wrapper = ImdbFactory.eINSTANCE.createTitleTypeWrapper();
					wrapper.setTitleType(type);
					return wrapper;
					})
				.collect(Collectors.toSet());
	}

	/**
	 * Use as part of a filter expression.
	 * 
	 * @param self
	 * @param titleType
	 * @return whether the {@link Title} is of the provided {@link TitleType}.
	 * Also returns {@code true} if <b>self</b> is not a {@link Title}.
	 */
	public boolean isOneOfTitleTypes(EObject self, Collection<TitleTypeWrapper> titleTypes) {
		if (!(self instanceof Title))
			return true;

		TitleType type = ((Title)self).getTitleType();
		return titleTypes.stream()
				.anyMatch(wrapper -> wrapper.getTitleType() == type);
	}
}

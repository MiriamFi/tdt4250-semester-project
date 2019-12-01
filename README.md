# TDT4250-Semester-Project
This project uses the IMDB Database found at https://www.imdb.com/interfaces/. You can download the sets from https://drive.google.com/open?id=1YmUb6XO-U-QRwuHYjgTz-tvFm5jrgisG 
We recommend using the google link, as the main imdb datsets use a different naming scheme, and the naming of the files in sets.zip is already correct.

## Requirements
`Sirius - https://www.eclipse.org/sirius/download.html, follow the marketplace guidelines` <br/>
`Eclipse with Eclipse Modeling tools - https://www.eclipse.org/downloads/ Select Eclipse Modeling tools during installation`

## Import the project
You can import the project by opening a new Eclipse Workspace, preferably located in the root folder of the project downloaded from this page, and clicking Open Projects from file system. And then choosing the root folder of the project downloaded from this page.

## Deserializing the datsets
First you can choose to either use the dataset included which are filtered by Region, or use the entire datasets available at imdb, however when downloading these datasets, they will need to be renamed to match the existing datasets. 
`
name.basics -> persons.tsv
title.basics.tsv -> titles.tsv
title.ratings.tsv -> ratings.tsv
title.principals.tsv -> involvements.tsv
title.episode.tsv -> episodesDetails.tsv
`
These need to be placed in `*\imdb\src\imdb\dataset\`

When these are placed correctly, you can run DatasetDeserializer.java located in `*\imdb\src\imdb\dataset\` This will deserialize the tsv files and serialize them to a single xmi file. Currently the deserializer is set to choose 500 random titles, and information and people that are connected to these titles. This value can be changed in the `hash500RandomTVSeries()` function. We recommend never going above 500 random titles, and actually reducing the number of titles to possibly 100-200, as most computers will struggle viewing anything more in the Sirius viewpoints that show large amounts of data. 

After being run the xmi will be named Imdb.imdb and placed in `*\imdb.sirius.editor.model\Imdb.imdb`

## Running Sirius
Now that the dataset has been deserialized, you are ready to show the data in the sirius viewpoints. To do this Click <br/>
`Run -> Run Configurations -> Eclipse Application -> Run`<br/>

When the new workspace has opened do the following <br/>

`Import Projects -> General -> Existing Projects into Workspace -> Browse -> *Root folder of the project directory* -> Select only imdb.odesign & imdb.sirius.editor.model -> Finish`<br/>

To create the first main Imdb diagram, go into <br/> `imdb.sirius.editor.model -> Imdb.imdb -> Right click Imdb -> New Representation -> Imdb Diagram -> Finish -> OK`<br/>

The viewpoint should now open. From here you can navigate to all other different viewpoints, trees and tables available. See the flowchart to see the navigation options.

## Issues Identified
Sometimes the TV Series tree won't render all tv series items, we believe this is due to the viewpoint rendering quicker than the java services code can run, if the tree is empty, go into the odesign file located at <br/>`imdb.odesign\descriptions\odesign.odesign`<br/>
Under <br/>`imdb_viewpoint->TVseries tree->Imdb->TVseries branch->Season branch`<br/> In Season Branch's Semantic Expression add a space so that<br/> `[self.getSeasons()/] -> [self.getSeasons() /]`<br/> and save. Going back to the tree viewpoint and collapse the IMDB view, and expand it, it should now properly render tv series with seasons and episodes.

## Ecore Model
![UML Diagram of the mode](https://github.com/MiriamFi/tdt4250-semester-project/blob/jacksyv-patch-1/UMLModel.PNG)

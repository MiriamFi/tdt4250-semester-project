# TDT4250-Semester-Project
This project uses the IMDB Database found at https://www.imdb.com/interfaces/. You can download the subsets used in this project from https://drive.google.com/open?id=1YmUb6XO-U-QRwuHYjgTz-tvFm5jrgisG. These were generated using Python and filtered by Region, showing only titles from the US, except for TvEpisodes, these can be from any region, but must be connected to a series originating in the US. All other subsets are filtered by what is contained in the region based subset.
We recommend using the google link, as the main imdb datsets use a different naming scheme, and the naming of the files in sets.zip is already correct. In addition we've also added a deserialized Imdb.imdb, as deserializing uses a massive amount of memory, and can crash on some computers. To deserialize, we recommend never using the full datasets from Imdb, and even when using the subsets, you should add an argument to increase the max memory usage of Java to 4,5-5gb RAM. 

## Requirements
`Sirius - https://www.eclipse.org/sirius/download.html, follow the marketplace guidelines` <br/>
`Eclipse with Eclipse Modeling tools - https://www.eclipse.org/downloads/ Select Eclipse Modeling tools during installation`

## Import the project
You can import the project by opening a new Eclipse Workspace, preferably located in the root folder of the project downloaded from this page, and clicking Open Projects from file system. And then choosing the root folder of the project downloaded from this page.

## Deserializing the datsets
First you can choose to either use the dataset from the google link, or use the datasets available at imdb, however when downloading the imdb datasets, they will need to be renamed to match the following. 
`
name.basics -> persons.tsv
title.basics.tsv -> titles.tsv
title.ratings.tsv -> ratings.tsv
title.principals.tsv -> involvements.tsv
title.episode.tsv -> episodesDetails.tsv
`
These need to be placed in `*\imdb\src\imdb\dataset\`

When these are placed correctly, you can run DatasetDeserializer.java located in `*\imdb\src\imdb\dataset\` This will deserialize the tsv files and serialize them to a single xmi file. Currently the deserializer is set to choose 500 random titles, and information and people that are connected to these titles. This value can be changed in the `hash500RandomTVSeries()` function. We recommend never going above 500 random titles, and actually reducing the number of titles to possibly 100-200, as most computers will struggle viewing anything more in the Sirius viewpoints that show large amounts of data. Remember that you might need to add an argument to increase max memory allocation to Java, for the subsets you will need about 4,5-5gb. We have not attempted to run this on the full datasets.

After being run the xmi will be named Imdb.imdb and placed in `*\imdb.sirius.editor.model\Imdb.imdb`

If you're using the xmi pre deserialized, move the Imdb.imdb file to 
<br/> `imdb.sirius.editor.model -> Imdb.imdb

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
This is the model used in the project.
![UML Diagram of the mode](https://github.com/MiriamFi/tdt4250-semester-project/blob/jacksyv-patch-1/readme-photos/UMLModel.PNG)<br/>


## Navigation in Sirius Editor
The user can navigate through the different representations when using the Sirius editor in the runtime Eclipse. The boxes represent the different representations, and the small boxes inside represent the different elements which can be clicked in order to navigate. Sometime the user will `right click -> Navigation -> *Chosen representation* `, and other times the user will `right click -> New/Open -> *Chosen representation* `. 
![UML Diagram of the mode](https://github.com/MiriamFi/tdt4250-semester-project/blob/jacksyv-patch-1/readme-photos/Navigation.jpg)

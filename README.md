# tdt4250-semester-project
This project uses a subset of the IMDB Database found at https://www.imdb.com/interfaces/. The subset has been created using python to select only titles made in the US, and aftwrwards filtering all other datasets to include only items that exist or are associated with the US titles.


## Import the project
You can import the project by opening Eclipse Modeling tools, and using Open Projects from file system. 

## Deserializing the datsets
First you can choose to either use the dataset included which are filtered by Region, or use the entire datasets available at imdb, however when downloading these datasets, they will need to be renamed to match the existing datasets. 
`
name.basics -> persons.tsv
title.basics.tsv -> titles.tsv
title.ratings.tsv -> ratings.tsv
title.principals.tsv -> involvements.tsv
`
These need to be placed in `*\imdb\src\imdb\dataset\`

When these are placed correctly, you can run DatasetDeserializer.java located in `*\imdb\src\imdb\dataset\` This will deserialize the tsv files and serialize them to a single xmi file. Currently the deserializer is set to choose 500 random titles, and information and people that are connected to these titles. This value can be changed in the `hash500RandomTVSeries()` function. We recommend never going above 500 random titles, and actually reducing the number of titles to possibly 100-200, as most computers will struggle viewing anything more in the Sirius viewpoints that show large amounts of data. 

After being run the xmi will be named Imdb.imdb and placed in `*\imdb.sirius.editor.model\Imdb.imdb`

## Running Sirius
Now that the dataset has been deserialized, you are ready to show the data in the sirius viewpoints. To do this Click 
`Run -> Run Configurations -> Eclipse Application -> Run`

When the new workspace has opened do the following

`Import Projects -> General -> Existing Projects into Workspace -> Browse -> *Root folder of the project directory* -> Select only imdb.odesign & imdb.sirius.editor.model -> Finish`

To create the first main Imdb diagram, go into `imdb.sirius.editor.model -> Imdb.imdb -> Right click Imdb -> New Representation -> Imdb Diagram -> Finish -> OK`

The viewpoint should now open. From here you can navigate to all other different viewpoints, trees and tables available. See the flowchart to see the navigation options.

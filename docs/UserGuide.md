---
layout: page
title: User Guide
---

* Table of Contents
{:toc}
--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## **Introduction**

<img src="images/MyLibLogo.png">

MyLib is a desktop bookmarking application originally built to serve as a single platform for organising and tracking all the online webnovels and comics that you may be reading. However, its general bookmarking features is more than capable of handling any other bookmarking tasks you might have. This not only includes other types of novels, but also blogs, articles, reddit posts, Youtube videos and anything else that you want to track!

With MyLib, you have the ability to throw all your bookmarks onto a **single platform**, and organise them in a **highly personalized** way via a custom set of tags or labels that you can define on your own.

MyLib is optimized for use via a Command Line Interface (CLI) while still having the benefits of a Graphical User Interface (GUI). This means that most of MyLib's features are meant to be accessed through typed commands rather than mouse clicks. However, the commands are simple enough such that typing them out will not be much slower than using a GUI, if at all!

--------------------------------------------------------------------------------------------------------------------
## **About this User Guide**

### Target Audience
This User Guide is mainly targeted towards new users who want to get started using MyLib to bookmark their content. It can also serve as a comprehensive reference and guide for current users of the application.

### Objectives of this User Guide

This User Guide provides an easy-to-understand and comprehensive documentation, so you can easily start using MyLib. It covers how to download the application, launch the application and the various features in MyLib that will make it easy for you to bookmark all your content.
<div style="page-break-after: always;"></div>

### How to use the User Guide

This User Guide is split into multiple important sections:
* The [Getting Started](#getting-started) section provides step-by-step instructions to download and get started with MyLib.
* The [Key Definitions](#key-definitions) section provides a concise explanation of the various key terms used in this User Guide. It will explain what a bookmark is in the context of MyLib.
* The [Graphical User Interface](#graphical-user-interface) section provides a quick rundown of the different components of MyLib's user interface.
* The [Features](#features) section provides detailed explanations of all the various features in MyLib to help you bookmark your content.

If you are a new user, we recommend going through the sections in the order provided above. If you are an experienced user and are just looking for a quick reference, we recommend either going through the [Features](#features) section or the [Command Summary](#command-summary) table.


The user guide will contain certain visuals to aid in conveying information more effectively. These include:

:information_source: **Info** - Useful supplementary information

:bulb: **Tip** - Suggestions on how to enhance your experience

:exclamation: **Warning**  - Warning  of a potentially dangerous action that you should be aware of

--------------------------------------------------------------------------------------------------------------------

## Getting Started

1. Ensure you have Java `11` or above installed in your Computer.

2. Download the latest `MyLib.jar` from [here](https://github.com/AY2223S2-CS2103T-T13-4/tp/releases).

3. Copy the file to the folder you want to use as the _home folder_ for your Library.

4. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar myLib.jar` command to run the application.

5. A GUI similar to the one below should appear in a few seconds. You can get an overview of the various components that make up MyLib's GUI [here](#graphical-user-interface).

    <img width="560" height="400" style="margin-top:20px; margin-bottom:20px" src="images/Ui.png">

6. If this is your first time running the application, it should contain some sample bookmarks.

7. MyLib's functionality is accessed through typed commands. These commands are entered into the [command box](#graphical-user-interface) at the very top of the GUI. After entering the command, press enter to execute it and the result of that command will be displayed below the command box.

### Let's try out some of the features
1. Let's start by trying to add a bookmark.

   * Enter `add n/My Book a/My Book's Author g/Fantasy r/4` into the command box and press the Enter key.
   * Adds a bookmark for the book with the title `My Book`, the author `My Book's Author` and the genre `Fantasy` to your bookmark library.
   
2. Now, let's try editing the title in the bookmark you just added

   * Enter `edit 5 n/Edited Title` into the command box and press the Enter key.
   
   * This edits the title of your bookmark, changing it from `My Book` to `Edited Title`

3. Finally, let's delete that bookmark and exit the application

   * Enter `delete 5` into the command box and press the Enter key.
   
   * This will delete your bookmark

   * Next, use `exit` to exit the application.

4. You will be able to find a detailed guide on the list of available commands in the [Features](#features) section.

--------------------------------------------------------------------------------------------------------------------
## Key Definitions
This section provides explanations of important terms that will be used in this User Guide.

### Content

Content refers to anything that is tracked with bookmarks. These include, but are not limited to, novels, blogs, reddit posts, manga and web novels.

### Bookmark
A bookmark is the primary entity in MyLib and is used to track all your content for all your bookmarking tasks in MyLib. 

A bookmark may contain:
* A title - the title of the content that is being tracked by this bookmark
* An author - the author of the content that is being tracked by this bookmark
* A progress - consists of volume, chapter and page, and is used to track your progress with the content being tracked by this bookmark.
* A genre - the genre your content falls under. Examples genres include your typical book genres such as Action and Fantasy.
* A rating - to indicate how much you enjoyed the content being tracked by this bookmark
* Tag - a custom label attached to a bookmark for categorization purposes.
* URL - to hold the URL of the website that the content being tracked by this bookmark is hosted at.

For a bookmark in MyLib, everything except for title and genre is optional.

### Parameters
Parameters refer to the upper-cased words used to represent required user inputs into the commands.

| Prefix | Parameter | Description                                                                                                                                                                                                                                                                                                                                        |
|:------:|:---------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|  `n/`  |   TITLE   | TITLE is the name used to identify each bookmark added to the library. Usually it refers to the name of the book.<br/><br/>**Restrictions:**<br/>None<br/>                                                                                                                                                                                         |
|  `a/`  |  AUTHOR   | AUTHOR is the author of the book/manga/webnovel.<br/><br/>**Restrictions:**<br/>None                                                                                                                                                                                                                                                               |
|  `p/`  | PROGRESS  | PROGRESS is the current reading progress for the bookmark and it is tracked using the three markers Volume, Chapter and Page.<br/> If any of the markers do not apply, they can be replaced with "~" to remove tracking for that progress marker.<br/><br/>**Restrictions:**<br/>3 positive integers or "~" with space between [Vol] [Chap] [Page] |
|  `g/`  |   GENRE   | GENRE is used to categorize the genre for each bookmark. It is selected from a fixed list included in the application.<br/> Should none of the default GENREs apply, "Others" can be used to categorize the bookmark.<br/><br/>**Restrictions:**<br/>Must be one from pre-defined genre list :information_source: Case sensitive                   |
|  `u/`  |    URL    | URL is used to store the url to the website containing the bookmarked content. <br/><br/>**Restrictions:**<br/>Must contain [Protocol][Domain name] for example: [http://]www.[example.com]                                                                                                                                                        |
|  `r/`  |  RATING   | Rating is the rating given each content.<br/><br/>**Restrictions:**<br/>Must be an integer from 0 to 5                                                                                                                                                                                                                                             |
|  `t/`  |    TAG    | TAGs are used to personalize and classify bookmarks stored on MyLib. <br/><br/>**Restrictions:**<br/>Must only contains Alphabets and Numbers no spaces are allowed                                                                                                                                                                                |

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## **Graphical User Interface**<br>

   <img width="680" src="images/annotated-UI.png">

### Purposes of each GUI component

|     Component      |                          Purpose                          |
|:------------------:|:---------------------------------------------------------:|
|    Command Box     |                 To accept user commands.                  |
|     Result Box     | To display the result of the commands that user executed. |
| BookmarkList Panel |         To display the current list of bookmarks          |
|     View Panel     |      To display the details of a specified bookmark       |

<div style="page-break-after: always;"></div>

### Bookmark UI details

<img width="680" src="images/bookmarkCardUI.png">

The bookmark in the BookmarkList panel will only contain the:
* Title
* Author
* Progress
* Genre
* Rating
* Tag


--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## Features

<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/TITLE`, `TITLE` or name of `TITLE` is a parameter which can be used as `add n/The Odessey`.

* Items in square brackets are optional.<br>
  e.g `n/TITLE [t/TAG]` can be used as `n/The Odessey t/School` or as `n/The Odessey`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/School`, `t/School t/Literature` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/TITLE a/AUTHOR`, `a/AUTHOR n/TITLE` is also acceptable.

* If a parameter is expected only once in the command, but you specified it multiple times, only the last occurrence of the parameter will be taken.<br>
  e.g. if you specify `a/John Butcher a/Jim Butcher`, only `a/Jim Butcher` will be taken.

* Extra parameters for commands that do not take in parameters (such as `help`, `list`, `exit`, `genre`, `tags` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.
</div>
<div style="page-break-after: always;"></div>

<div markdown="block" class="alert alert-info">
* List of prefixes used in commands :

</div>
<div style="page-break-after: always;"></div>


### Adding a tag: `addtag`

Adds a tag to the list of tags.

:bulb: **Tip:** You need to add a tag to the tag list first before using it. 

Format: `addtag [t/TAG]…`

Examples:
* `addtag t/Novel t/MaleProtagonist`
* `addtag t/FemaleProtagonist`

### Deleting a tag: `dtag`

Deletes a tag from the tag list.

Format: `dtag TAGNAME`

Example:
* `dtag MaleProtagonist`

### Listing all tags: `tags`
Lists all tags in the tag list.

Format: `tags`

### Listing available Genres: `genre`
Shows list of all valid Genres.

Format: `genre`
<div style="page-break-after: always;"></div>

### Adding a bookmark: `add`

Adds a bookmark to the library.

Format: `add n/TITLE g/GENRE [a/AUTHOR] [p/PROGRESS] [r/RATING] [u/URL] [t/TAG]…​`

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
A bookmark can have any number of tags (including 0)
</div>

Examples:
* `add n/Hobbit a/J. R. R. Tolkien p/1 ~ 256 r/4 g/Fantasy`
* `add n/The Odyssey a/Homer p/1 1 23 g/Action r/5 t/Literature`

### Deleting a bookmark : `delete`

Deletes the specified bookmark from the library.

Format: `delete INDEX`

* Deletes the bookmark at the specified `INDEX`.
* The index refers to the index number shown in the displayed bookmark list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `delete 2` deletes the 2nd bookmark in the library.
* `find n/Chainsaw Man` followed by `delete 1` deletes the 1st bookmark in the results of the `find` command.
<div style="page-break-after: always;"></div>

### Editing a bookmark : `edit`

Edits an existing bookmark in the library.

Format: `edit INDEX [n/TITLE] [a/AUTHOR] [p/PROGRESS] [g/GENRE] [r/RATING] [u/URL] [t/TAG]…​`

* Edits the bookmark at the specified `INDEX`. The index refers to the index number shown in the displayed bookmark list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* The genre and tags provided must be in the list of existing genre and tags respectively.
* Existing values will be updated to the input values.
* When editing tags, the existing tags of the bookmark will be removed i.e adding of tags is not cumulative.
* You can remove all the bookmark’s tags by typing `t/` without specifying any tags after it.

Examples:
*  `edit 1 n/Hobbit a/J. R. R. Tolkien` Edits the title and author of the 1st bookmark to be `Hobbit` and `J. R. R. Tolkien` respectively.
*  `edit 2 n/The Odyssey t/` Edits the name of the 2nd bookmark to be `The Odyssey` and clears all existing tags.

### Sorting bookmarks : `sort`

Sorts the list of bookmarks by ratings in either ascending or descending order.

Format : sort [ORDER]
* ORDER can only be either `asc` or `desc`
* ORDER is case-sensitive. e.g. `sort ASC` does not work.

Examples:
* sort asc
* sort desc
<div style="page-break-after: always;"></div>

### Locating bookmarks by specific fields: `find`

Find bookmarks whose specified fields contain the given keywords.

`find` helps you to find bookmarks whose specified fields contain the given keywords. You can use this when you
want to filter out certain bookmarks from your large list of bookmarks. `find` allows you to search for bookmarks
using the title, author, genre and/or tags of a bookmark.

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
You can use the `list` command to get back the bookmarks that you have filtered out after `find`.
</div>

Format: `find [n/TITLE] [a/AUTHOR] [g/GENRE] [t/TAG]…​`

* At least one of the optional fields must be provided.
* The search for name and author is case-insensitive. e.g. `rankers` will match `Rankers`
* The search for genre and tag is case-sensitive. e.g. `fantasy` will not match `Fantasy`
* The genre and tags provided must be in the list of existing genre and tags respectively.
* The order of the keywords matter. e.g. `Guide Rankers` will not match `Rankers Guide`
* Only the fields of the specified prefixes are searched.
* Only full words will be matched e.g. `Ranker` will not match `Ranker's`.
* The search for tags will return any bookmark that has a tag that matches the given tag.

Examples:
* `find n/ranker's g/Fantasy` returns `Ranker's Guide to an Ordinary Life` that has the genre `Fantasy`
* `find n/Chainsaw Man` after `list` returns `chainsaw man` and `Chainsaw Man` as shown in figure 1 below.
<div style="page-break-after: always;"></div>

![Find](images/find-chainsaw%20man.png)
<figcaption style="text-align:center"><em><strong>
   Figure 1
   </strong>
   : Executing find after start up
   </em></figcaption>


### Listing all bookmarks/ Resetting filters : `list`

Shows a list of all bookmarks in the library.

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
Use this command to get back the original list of bookmarks after using `find` command to filter out bookmarks.
</div>

Format: `list`
<div style="page-break-after: always;"></div>

### Viewing a bookmark's details : `view`

Displays details of Bookmark in the right side panel.

Format: `view INDEX`

* gets bookmark at the specified `INDEX` and displays its details.
* The index refers to the index number shown in the displayed bookmark list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `view 2` displays the 2nd bookmark in the library as shown in figure 2 below.
* `find n/Chainsaw Man` followed by `goto 1` displays 1st bookmark in the results of the `find` command.

![View](images/View-command.png)
<figcaption style="text-align:center"><em><strong>
   Figure 2
   </strong>
   : Executing view after list
   </em></figcaption>

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
Our Application also supports this feature in GUI format, simply click onto the bookmark you want and watch the magic happen.
But do note that there will not be a response in result box since this is not a CLI command.
</div>
<div style="page-break-after: always;"></div>

### Going to a url : `goto`

Opens up specified bookmark's url in default browser

Format: `goto INDEX`

* Opens the url of bookmark at the specified `INDEX`.
* The index refers to the index number shown in the displayed bookmark list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `goto 2` opens up the url of  2nd bookmark in the library.
* `find n/Chainsaw Man` followed by `goto 1` opens url of the 1st bookmark in the results of the `find` command.

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
Our Application also supports this feature in GUI format, clicking on the url in the right panel will open it on your default browser .
But do note that there will not be a response in result box since this is not a CLI command.
</div>

### Clearing all entries : `clear`

Clears all bookmark entries from the MyLib. You will still keep your list of genres and tags after using the `clear` command.

Format: `clear`
<div style="page-break-after: always;"></div>

### Viewing help : `help`

Shows a message explaning how to access the help page.

![help message](images/helpMessage.png)

Format: `help`


### Exiting the program : `exit`

Exits the program.

Format: `exit`

### Saving the data

MyLib data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

### Editing the data file

MyLib data are saved as a JSON file `[JAR file location]/data/library.json`. Advanced users are welcome to update data directly by editing that data file.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution:**
If your changes to the data file makes its format invalid, MyLib will discard all data and start with an empty data file at the next run.
</div>
<div style="page-break-after: always;"></div>

### Archiving data files `[coming in v2.0]`

_Details coming soon ..._

--------------------------------------------------------------------------------------------------------------------


## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous MyLib home folder.

**Q**: Do I need an internet connection to run MyLib?<br>
**A**: No, MyLib can boot up and run all functionalities without an internet connection.

**Q**: Can I use MyLib on my mobile device?<br>
**A**: Unfortunately, MyLib is only designed to run on your desktop/laptop such that you can use the command line interface.

--------------------------------------------------------------------------------------------------------------------
<div style="page-break-after: always;"></div>

## Command summary

| Action                         | Format, Examples                                                                                                                                   |
|:-------------------------------|:---------------------------------------------------------------------------------------------------------------------------------------------------|
| **Add a bookmark**             | `add n/TITLE g/GENRE [a/AUTHOR] [p/PROGRESS] [r/RATING] [u/URL] [t/TAG]…​` <br> e.g., `add n/The Odyssey 2 a/Homer p/1 ~ 32 g/Others t/Literature` |
| **Clear bookmarks**            | `clear`                                                                                                                                            |
| **Delete a bookmark**          | `delete INDEX`<br> e.g., `delete 3`                                                                                                                |
| **Edit a bookmark**            | `edit INDEX [n/TITLE] [a/AUTHOR] [p/PROGRESS] [g/GENRE] [r/RATING] [u/URL] [t/TAG]…​`<br> e.g.,`edit 1 n/Hobbit a/J. R. R. Tolkien`                |
| **Find bookmarks**             | `find [n/TITLE] [a/AUTHOR] [g/GENRE] [t/TAG]…​`<br> e.g., `find n/ Chainsaw Man`                                                                   |
| **GoTo url of bookmark**       | `goto INDEX`<br> e.g., `goto 3`                                                                                                                    |
| **List all bookmarks**         | `list`                                                                                                                                             |
| **Sort bookmark by ratings**   | `sort [ORDER]` <br> e.g., `sort asc`, `sort desc`                                                                                                  |
| **Help**                       | `help`                                                                                                                                             |
| **List all tags**              | `tags`                                                                                                                                             |
| **Add a tag**                  | `addtag [t/TAG]…` <br> e.g., `addtag t/Novel`                                                                                                      |
| **Delete a tag**               | `dtag TAGNAME` <br> e.g., `dtag MaleProtagonist`                                                                                                   |
| **List all genres**            | `genre`                                                                                                                                            | 

<div style="page-break-after: always;"></div>

## **Glossary**

|           Term           |                                                            Explanation                                                             |
|:------------------------:|:----------------------------------------------------------------------------------------------------------------------------------:|
|  Command Line Interface  |           A text-based user interface used to run programs and interact with the computer  by typing in textual commands           |
| Graphical User Interface |  interface that uses icons, menus and a mouse (to click on the icon or pull down the menus) to manage interaction with the system  |
|         Terminal         |                             Text-based interface used to interact with the computer's operating system                             |
|        Parameter         |                A named value that is passed in by the user. This value changes depending on what the user  enters.                 |
|        Hard disk         |                            A data storage device that maintain stored data when computer is  turned off                            |
|         Bookmark         | The type of data being tracked by our app, It contains a compulsory TITLE and GENRE associated to it and other optional Parameters |


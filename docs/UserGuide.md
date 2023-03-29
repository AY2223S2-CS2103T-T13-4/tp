---
layout: page
title: User Guide
---

* Table of Contents
{:toc}

--------------------------------------------------------------------------------------------------------------------
## **Introduction**

MyLib is a desktop application originally built to serve as a single platform for organising and tracking all the online webnovels and comics that you may be reading. However, it is more than capable of doing so for any other reading material you might be interested in, such as blogs, articles, research papers and basically anything you can read!

With MyLib, you have the ability to easily organise all your reading materials in a **single platform**, in a **highly personalized** way via a custom set of tags or labels that you can define on your own.

MyLib is **optimized for use via a Command Line Interface** (CLI) while still having the benefits of a Graphical User Interface (GUI). This means that most of MyLib's features are meant to be accessed through typed commands rather than mouse clicks.

If you are a fast typer who is seeking a one-stop platform to organise and track your readings (online or physical), then MyLib is what you need! Even if you are not a fast typer, the commands are simple enough such that typing them out will not be much slower than using a GUI, if at all!


--------------------------------------------------------------------------------------------------------------------
## **About User Guide**

### Objectives of the User Guide

This User Guide provides an easy to understand and comprehensive documentation, so you can easily start using MyLib. It covers how to download the application, launch the application and the various features in MyLib that will make it easy for you to organise and track all your reading materials.

### How to use the User Guide

The user guide contains certain visuals to aid in conveying information more effectively

:information_source: **Info** - Useful supplementary information

:bulb: **Tip** - Suggestions on how to enhance your experience

:exclamation: **Warning**  - Warning  of a potentially dangerous action that you should be aware of

### Getting Started
Head on over to the [Quick start](#quick-start) section to get started with MyLib!

If you are an experienced user, you can refer to [Command Summary](#command-summary) for a quick overview of MyLib's commands.

--------------------------------------------------------------------------------------------------------------------

## Quick start

1. Ensure you have Java `11` or above installed in your Computer.

1. Download the latest `myLib.jar` from [here](https://github.com/AY2223S2-CS2103T-T13-4/tp/releases).

1. Copy the file to the folder you want to use as the _home folder_ for your Library.

1. Open a command terminal, `cd` into the folder you put the jar file in, and use the `java -jar myLib.jar` command to run the application.<br>
   A GUI similar to the below should appear in a few seconds. Note how the app contains some sample data.<br>
   ![Ui](images/Ui.png)

1. Type the command in the command box and press Enter to execute it. e.g. typing **`help`** and pressing Enter will open the help window.<br>
   Some example commands you can try:

   * `list` : Lists all Bookmarks.

   * `add n/The Odyssey a/Homer p/1 1 1 g/Fantasy r/4 u/http://classics.mit.edu/Homer/odyssey.html t/Literature class readings` : Adds a bookmark for the book `The Odessey` to the Library.

   * `delete 3` : Deletes the 3rd Bookmark shown in the current list.

   * `clear` : Deletes all Bookmarks.
   
<<<<<<< HEAD
   * `clear` : Goto url of Bookmark.
=======

   * `goto 1` : Opens the url of 1st Bookmark shown in current list.

>>>>>>> master
   
   * `exit` : Exits the app.

1. Refer to the [Features](#features) below for details of each command. 

--------------------------------------------------------------------------------------------------------------------

## Features


<div markdown="block" class="alert alert-info">

**:information_source: Notes about the command format:**<br>

* Words in `UPPER_CASE` are the parameters to be supplied by the user.<br>
  e.g. in `add n/TITLE`, `TITLE` or name of `TITLE` is a parameter which can be used as `add n/The Odessey`.

* Items in square brackets are optional.<br>
  e.g `n/TITLE [t/TAG]` can be used as `n/The Odessey t/School` or as `n/The Odessey`.

* Items with `…`​ after them can be used multiple times including zero times.<br>
  e.g. `[t/TAG]…​` can be used as ` ` (i.e. 0 times), `t/School`, `t/School t/Recreational` etc.

* Parameters can be in any order.<br>
  e.g. if the command specifies `n/TITLE a/AUTHOR`, `a/AUTHOR n/TITLE` is also acceptable.

* If a parameter is expected only once in the command but you specified it multiple times, only the last occurrence of the parameter will be taken.<br>
  e.g. if you specify `a/John Butcher a/Jim Butcher`, only `a/Jim Butcher` will be taken.

* Extraneous parameters for commands that do not take in parameters (such as `help`, `list`, `exit` and `clear`) will be ignored.<br>
  e.g. if the command specifies `help 123`, it will be interpreted as `help`.

* List of prefixes used in commands :
  * `n/` - TITLE
  * `a/` - AUTHOR
  * `p/` - PROGRESS
  * `g/` - GENRE
  * `u/` - URL
  * `t/` - TAGS

</div>

### Viewing help : `help`

Shows a message explaning how to access the help page.

![help message](images/helpMessage.png)

Format: `help`

### Adding a tag: `addtag`

Adds a tag to the list of tags.

Format: `addtag [t/TAG]…`

Examples: 
* `addtag t/Novel t/MaleProtagonist`
* `addtag t/FemaleProtagonist`

### Deleting a tag: `dtag`

Deletes a tag from the tag list.

Format: `dtag TAGNAME`

Example:
* `dtag MaleProtagonist`

### Listing all tags: tags
Lists all tags in the tag list.

Format: `tags`

### Adding a bookmark: `add`

Adds a bookmark to the library.

Format: `add n/TITLE a/AUTHOR p/PROGRESS g/GENRE r/RATING [u/URL] [t/TAG]…​`

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
A bookmark can have any number of tags (including 0)
</div>

Examples:
* `add n/Hobbit a/J. R. R. Tolkien p/Finished r/4 g/Fantasy`
* `add n/The Odyssey a/Homer p/Reading g/Action r/5 n/Literature class readings`

### Listing all bookmarks : `list`

Shows a list of all bookmarks in the library.

Format: `list`

### Editing a person : `edit`

Edits an existing bookmark in the library.

Format: `edit INDEX [n/TITLE] [a/AUTHOR] [p/PROGRESS] [g/GENRE] [r/RATING] [u/URL] [t/TAG]…​`

* Edits the bookmark at the specified `INDEX`. The index refers to the index number shown in the displayed bookmark list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* The genre and tags provided must be in the list of existing genre and tags respectively.
* Existing values will be updated to the input values.
* When editing tags, the existing tags of the person will be removed i.e adding of tags is not cumulative.
* You can remove all the person’s tags by typing `t/` without specifying any tags after it.

Examples:
*  `edit 1 n/Hobbit a/J. R. R. Tolkien` Edits the title and author of the 1st bookmark to be `Hobbit` and `J. R. R. Tolkien` respectively.
*  `edit 2 n/The Odyssey t/` Edits the name of the 2nd person to be `The Odyssey` and clears all existing tags.

### Locating bookmarks by specific fields: `find`

<<<<<<< HEAD
<<<<<<< Updated upstream
=======

>>>>>>> master
Find bookmarks whose specified fields contain the given keywords.
=======

<<<<<<< HEAD
`find` helps you to find bookmarks whose specified fields contain the given keywords. You can use this when you
want to filter out certain bookmarks from your large list of bookmarks. `find` allows you to search for bookmarks 
using the title, author, genre and/or tags of a bookmark.
>>>>>>> Stashed changes

Format: `find [n/TITLE] [a/AUTHOR] [g/GENRE] [t/TAG]`
=======

Format: `find [n/TITLE] [a/AUTHOR] [g/GENRE] [t/TAG]…​`
>>>>>>> master


* At least one of the optional fields must be provided.
* The search for name and author is case-insensitive. e.g. `rankers` will match `Rankers`
* The search for genre and tag is case-sensitive. e.g. `fantasy` will not match `Fantasy`
* The genre and tags provided must be in the list of existing genre and tags respectively.
* The order of the keywords matter. e.g. `Guide Rankers` will not match `Rankers Guide`
* Only the fields of the specified prefixes are searched.
* Only full words will be matched e.g. `Ranker` will not match `Ranker's`

Examples:
* `find n/Chainsaw Man` returns `chainsaw man` and `Chainsaw Man`
* `find n/ranker's g/Fantasy` returns `Ranker's Guide to an Ordinary Life` that has the genre `Fantasy`
*  `find a/Yoo Heonhwa` returns every bookmark whose author of the book is Yoo Heonhwa<br>


### Deleting a person : `delete`

Deletes the specified bookmark from the library.

Format: `delete INDEX`

* Deletes the bookmark at the specified `INDEX`.
* The index refers to the index number shown in the displayed bookmark list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `delete 2` deletes the 2nd bookmark in the library.
* `find n/Chainsaw Man` followed by `delete 1` deletes the 1st bookmark in the results of the `find` command.

### Going to a url : `goto`

Opens up specified bookmark's url in default browser

Format: `goto INDEX`

* Opens the url of bookmark at the specified `INDEX`.
* The index refers to the index number shown in the displayed bookmark list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `goto 2` opens up the url of  2nd bookmark in the library.
* `find n/Chainsaw Man` followed by `goto 1` opens url of the 1st bookmark in the results of the `find` command.


### Clearing all entries : `clear`

Clears all entries from the MyLib.

Format: `clear`

### Listing available Genres: `genre`
Shows list of all valid Genres.

Format: `genre`

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

### Archiving data files `[coming in v2.0]`

_Details coming soon ..._

--------------------------------------------------------------------------------------------------------------------

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous MyLib home folder.

--------------------------------------------------------------------------------------------------------------------

## Command summary

Action | Format, Examples
--------|------------------
**Add** | `add n/TITLE a/AUTHOR p/PROGRESS g/GENRE [u/URL] [t/TAG]…​` <br> e.g., `add n/The Odyssey a/Homer p/Reading g/Epic poetry t/Literature class readings`
**Clear** | `clear`
**Delete** | `delete INDEX`<br> e.g., `delete 3`
**Edit** | `edit INDEX [n/TITLE] [a/AUTHOR] [p/PROGRESS] [g/GENRE] [r/RATING] [u/URL] [t/TAG]…​`<br> e.g.,`edit 1 n/Hobbit a/J. R. R. Tolkien`
**Find** | `find [n/TITLE] [a/AUTHOR] [g/GENRE] [t/TAG]…​`<br> e.g., `find n/ Chainsaw Man`
**GoTo** | `goto INDEX`<br> e.g., `goto 3`
**List** | `list`
**Help** | `help`
**List Tags** | `tags`
**Adding a tag** | `addtag [t/TAG]…` <br> e.g., `addtag t/Novel`
**Deleting a tag** | `dtag TAGNAME` <br> e.g., `dtag MaleProtagonist`
**List Genres** | `genre`


---
layout: page
title: User Guide
---

MyLib is a **desktop app for managing bookmarks, optimized for use via a Command Line Interface** (CLI) while still having the benefits of a Graphical User Interface (GUI). If you can type fast, MyLib can get your bookmark management tasks done faster than traditional GUI apps.

* Table of Contents
{:toc}

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

   * `add n/The Odyssey a/Homer p/Reading g/Epic poetry t/Literature class readings` : Adds a bookmark for the book `The Odessey` to the Library.

   * `delete 3` : Deletes the 3rd Bookmark shown in the current list.

   * `clear` : Deletes all Bookmarks.
   
   * `clear` : Goto url of Bookmark.
   
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

</div>

### Viewing help : `help`

Shows a message explaning how to access the help page.

![help message](images/helpMessage.png)

Format: `help`


### Adding a bookmark: `add`

Adds a bookmark to the library.

Format: `add n/TITLE a/AUTHOR p/PROGRESS g/GENRE [t/TAG]…​`

<div markdown="span" class="alert alert-primary">:bulb: **Tip:**
A person can have any number of tags (including 0)
</div>

Examples:
* `add n/Hobbit a/J. R. R. Tolkien p/Finished g/Fantasy`
* `add n/The Odyssey a/Homer p/Reading g/Epic poetry n/Literature class readings`

### Listing all bookmarks : `list`

Shows a list of all bookmarks in the library.

Format: `list`

### Editing a person : `edit`

Edits an existing bookmark in the library.

Format: `edit INDEX [n/TITLE] [a/AUTHOR] [p/PROGRESS] [g/GENRE] [t/TAG]…​`

* Edits the bookmark at the specified `INDEX`. The index refers to the index number shown in the displayed bookmark list. The index **must be a positive integer** 1, 2, 3, …​
* At least one of the optional fields must be provided.
* Existing values will be updated to the input values.
* When editing tags, the existing tags of the person will be removed i.e adding of tags is not cumulative.
* You can remove all the person’s tags by typing `t/` without
    specifying any tags after it.

Examples:
*  `edit 1 n/Hobbit a/J. R. R. Tolkien` Edits the title and author of the 1st bookmark to be `Hobbit` and `J. R. R. Tolkien` respectively.
*  `edit 2 n/The Odyssey t/` Edits the name of the 2nd person to be `The Odyssey` and clears all existing tags.

### Locating bookmarks by title: `find`

Finds bookmarks whose titles contain any of the given keywords.

Format: `find KEYWORD [MORE_KEYWORDS]`

* The search is case-insensitive. e.g `ranker` will match `Ranker`
* The order of the keywords does not matter. e.g. `Guide Ranker` will match `Ranker Guide`
* Only the title is searched.
* Only full words will be matched e.g. `Ranker` will not match `Ranker's`
* Titles matching at least one keyword will be returned (i.e. `OR` search).
  e.g. `Ranker's Chainsaw` will return `Ranker's Guide to an Ordinary Life`, `Chainsaw Man`

Examples:
* `find Chainsaw Man` returns `chainsaw man` and `Chainsaw Man`
* `find ranker's demon` returns `Ranker's Guide to an Ordinary Life`, `Demon Slayer`<br>


### Deleting a person : `delete`

Deletes the specified bookmark from the library.

Format: `delete INDEX`

* Deletes the bookmark at the specified `INDEX`.
* The index refers to the index number shown in the displayed bookmark list.
* The index **must be a positive integer** 1, 2, 3, …​

Examples:
* `list` followed by `delete 2` deletes the 2nd bookmark in the library.
* `find Chainsaw Man` followed by `delete 1` deletes the 1st bookmark in the results of the `find` command.

### Going to a url : `goto

Opens up specified bookmark's url in default browser

Format: 'goto INDEX'

* Opens the url of bookmark at the specified `INDEX`.
* The index refers to the index number shown in the displayed bookmark list.
* The index **must be a positive integer** 1, 2, 3, …​

* Examples:
* `list` followed by `goto 2` opens up the url of  2nd bookmark in the library.
* `find Chainsaw Man` followed by `goto 1` opens url of the 1st bookmark in the results of the `find` command.


### Clearing all entries : `clear`

Clears all entries from the MyLib.

Format: `clear`

### Exiting the program : `exit`

Exits the program.

Format: `exit`

### Saving the data

MyLib data are saved in the hard disk automatically after any command that changes the data. There is no need to save manually.

### Editing the data file

MyLib data are saved as a JSON file `[JAR file location]/data/addressbook.json`. Advanced users are welcome to update data directly by editing that data file.

<div markdown="span" class="alert alert-warning">:exclamation: **Caution:**
If your changes to the data file makes its format invalid, MyLib will discard all data and start with an empty data file at the next run.
</div>

### Archiving data files `[coming in v2.0]`

_Details coming soon ..._

--------------------------------------------------------------------------------------------------------------------

## FAQ

**Q**: How do I transfer my data to another Computer?<br>
**A**: Install the app in the other computer and overwrite the empty data file it creates with the file that contains the data of your previous AddressBook home folder.

--------------------------------------------------------------------------------------------------------------------

## Command summary

Action | Format, Examples
--------|------------------
**Add** | `add n/TITLE a/AUTHOR p/PROGRESS g/GENRE [t/TAG]…​` <br> e.g., `add n/The Odyssey a/Homer p/Reading g/Epic poetry t/Literature class readings`
**Clear** | `clear`
**Delete** | `delete INDEX`<br> e.g., `delete 3`
**Edit** | `edit INDEX [n/TITLE] [a/AUTHOR] [p/PROGRESS] [g/GENRE] [t/TAG]…​`<br> e.g.,`edit 1 n/Hobbit a/J. R. R. Tolkien`
**Find** | `find KEYWORD [MORE_KEYWORDS]`<br> e.g., `find Chainsaw Man`
**GoTo** | `goto INDEX`<br> e.g., `goto 3`
**List** | `list`
**Help** | `help`


package seedu.library.model;

import java.nio.file.Path;
import java.util.Set;
import java.util.function.Predicate;

import javafx.collections.ObservableList;
import seedu.library.commons.core.GuiSettings;
import seedu.library.model.bookmark.Bookmark;
import seedu.library.model.tag.Tag;

/**
 * The API of the Model component.
 */
public interface Model {
    /** {@code Predicate} that always evaluate to true */
    Predicate<Bookmark> PREDICATE_SHOW_ALL_BOOKMARKS = unused -> true;

    /**
     * Replaces user prefs data with the data in {@code userPrefs}.
     */
    void setUserPrefs(ReadOnlyUserPrefs userPrefs);

    /**
     * Returns the user prefs.
     */
    ReadOnlyUserPrefs getUserPrefs();

    /**
     * Returns the user prefs' GUI settings.
     */
    GuiSettings getGuiSettings();

    /**
     * Sets the user prefs' GUI settings.
     */
    void setGuiSettings(GuiSettings guiSettings);

    /**
     * Returns the user prefs' library file path.
     */
    Path getLibraryFilePath();

    /**
     * Sets the user prefs' library file path.
     */
    void setLibraryFilePath(Path libraryFilePath);

    /**
     * Replaces library data with the data in {@code Library}.
     */
    void setLibrary(ReadOnlyLibrary library);

    /** Returns the Library */
    ReadOnlyLibrary getLibrary();

    /** Returns the tags */
    ReadOnlyTags getTags();

    /**
     * Returns true if a bookmark with the same identity as {@code bookmark} exists in the library.
     */
    boolean hasBookmark(Bookmark bookmark);

    /**
     * Deletes the given bookmark.
     * The bookmark must exist in the library.
     */
    void deleteBookmark(Bookmark target);

    /**
     * Adds the given bookmark.
     * {@code bookmark} must not already exist in the library.
     */
    void addBookmark(Bookmark bookmark);

    /**
     * Replaces the given bookmark {@code target} with {@code editedBookmark}.
     * {@code target} must exist in the library.
     * The bookmark identity of {@code editedBookmark} must not be the same as another existing bookmark in the library.
     */
    void setBookmark(Bookmark target, Bookmark editedBookmark);

    /** Returns an unmodifiable view of the filtered bookmark list */
    ObservableList<Bookmark> getFilteredBookmarkList();

    /**
     * Updates the filter of the filtered bookmark list to filter by the given {@code predicate}.
     * @throws NullPointerException if {@code predicate} is null.
     */
    void updateFilteredBookmarkList(Predicate<Bookmark> predicate);

    /**
     * Returns true if a tag with the same identity as {@code tag} exists in the tag list.
     */
    boolean hasTag(Set<Tag> tag);

    /**
     * Adds the given tags.
     * {@code tag} must not already exist in the tag list.
     */
    void addTags(Set<Tag> tag);
}

package seedu.address.logic.commands;

import seedu.address.logic.commands.exceptions.CommandException;
import seedu.address.model.Model;

public class TagCommand extends Command {
    public static final String SHOWING_HELP_MESSAGE = "Opened help window.";
    @Override
    public CommandResult execute(Model model) throws CommandException {
        return new CommandResult(SHOWING_HELP_MESSAGE, true, false);
    }
}

package me.noxgrim.polyCmd.internCommands;

import me.noxgrim.polyPlot.PolyPlot;
import me.noxgrim.polyPlot.graphics.plotter.FunctionPlotter;

/**
 * Removes a graph from the plotter.
 */
public class RemoveCommand extends Command {
  
  public RemoveCommand() {
    super("removefunction", "Usage: 'removefunction <function term>", "Removes a graph from the plotter.", 
        "Use to remove a function from the plotter.\n"
        + "<function term> is the term with which the function has beed added before.", new String[]{"removegraph", "remove", "rm"});
  }

  @Override
  public boolean perform(String[] args) {

    if (args.length == 1) {
      FunctionPlotter fp = PolyPlot.getMainPlotterController().getFunctionPlotter();
      
      try {
        fp.removeFunction(args[0]);
        fp.repaint();
        System.out.println("Removed function '" + args[0] + "'.");
        return true;
      } catch (IllegalArgumentException e) {
        System.err.println(e.getMessage());
      }
    }
    
    return false;
  }

}
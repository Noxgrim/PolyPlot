package me.noxgrim.polyPlot;

import me.noxgrim.polyPlot.command.CommandInterface;
import me.noxgrim.polyPlot.command.InputInterpreter;
import me.noxgrim.polyPlot.command.UnixInputInterpreter;


public class PolyPlot  {
  
  public static final String VERSION = "0.6.0";
  
  private static PlotterController main;
  
  private static InputInterpreter in;
  
  public static void main(String[] args) {
    
    
    main = new PlotterController();
    
    in = new UnixInputInterpreter(new CommandInterface(), null, 0);
    
    in.start();

  }
  
  public static PlotterController getMainPlotterController() {
    return main;
  }

}

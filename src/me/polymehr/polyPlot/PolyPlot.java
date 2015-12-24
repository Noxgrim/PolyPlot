package me.noxgrim.polyPlot;

import me.noxgrim.polyCmd.CommandInterface;
import me.noxgrim.polyCmd.InputInterpreter;
import me.noxgrim.polyCmd.LinuxInputInterpreter;


public class PolyPlot  {
  
  public static final String VERSION = "0.6.0";
  
  private static PlotterController main;
  
  private static InputInterpreter in;
  
  public static void main(String[] args) {
    
    
    main = new PlotterController();
    
    in = new LinuxInputInterpreter(new CommandInterface(), null, 0);
    
    in.start();

  }
  
  public static PlotterController getMainPlotterController() {
    return main;
  }

}

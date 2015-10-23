package me.noxgrim.polyPlot;

import me.noxgrim.polyPlot.command.Input;


public class PolyPlot  {
  
  public static final String version = "0.6.0";
  
  private static PlotterController main;
  
  private static Input in;
  
  public static void main(String[] args) {
    
    
    main = new PlotterController();
    
    in = new Input();
    
    in.start();

  }
  
  public static PlotterController getMainPlotterController() {
    return main;
  }

}

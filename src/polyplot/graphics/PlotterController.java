package polyplot.graphics;


import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Class that creates a window that contains
 * a <code>FunctionPlotter</code>.
 *
 * @author Noxgrim
 */
public class PlotterController extends JFrame {

    private static final long serialVersionUID = 6483735967730423588L;

    /**
     * Constructs a new <code>PlotterController</code>, that itself creates
     * a new {@link FunctionPlotter}.
     */
    public PlotterController(int pxX, int pxY) {
        super("PolyPlot");

        this.setSize(pxX, pxY);

        this.add(new FunctionPlotter());

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        this.setLocationRelativeTo(null);

        this.setVisible(true);


        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowIconified(WindowEvent e) {
                double rand = Math.random(); // A little easter egg...
                setTitle(rand <= 0.001 ? "Ame should really visit his Mom and not this window!"
                        : rand <= 0.1 ? "Dean's other other function plotter" : "PolyPlot");
            }
        });
    }
}

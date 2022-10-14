import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    private JPanel rootPanel;
    private JPanel headPanel;
    private JLabel heading;
    private JPanel bodyPanel;
    private JButton button;
    private JLabel locationLabel;
    private JLabel destinationLabel;
    private JLabel outputBox1;
    private JComboBox LocationSelector;
    private JComboBox DestinationSelector;
    private JLabel outputBox2;


    private static JFrame frame = new JFrame("SHORTEST PATH FINDER");
    public static JFrame getFrame() {
        return frame;
    }
    public Main() {
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String location = LocationSelector.getSelectedItem().toString();
                String destination = DestinationSelector.getSelectedItem().toString();



                Node loc1;
                Node loc2;
                //Scanner sc = new Scanner(System.in);
                Graph graph = new Graph(true);
                Node SamJonah = new Node(0, "Sam Jonah Library");
                Node Calc = new Node(1, "Calc");
                Node ScienceGate = new Node(4, "Science Gate");
                Node OldSite = new Node(5, "Old site");
                Node WestGate = new Node(5, "West Gate");
                Node NLT = new Node(6, "NLT Building");
                Node AmissahArthur = new Node(7, "Amissah Arthur Language Centre");
                Node ValcoHall = new Node(7, "Valco Hall");
                Node ScienceMarket = new Node(11, "Science Market");
                Node Code = new Node(13, "College of Distance Education");
                Node NEC = new Node(14, "New Examination Center (NEC)");
                Node CongregationalGrounds = new Node(16, "Congregational Grounds");
                Node ShuttleTerminal = new Node(18, "Shuttle Terminal");
                Node RoundAbout = new Node(20, "Round About");

                loc1 = SamJonah;
                loc2 = RoundAbout;
                // Our addEdge method automatically adds Nodes as well.
                // The addNode method is only there for unconnected Nodes,
                // if we wish to add any
                graph.addEdge(ScienceGate, WestGate, 1.6);
                graph.addEdge(ScienceGate, RoundAbout, 0.95);
                graph.addEdge(ScienceGate, ValcoHall, 0.5);
                graph.addEdge(ValcoHall, RoundAbout, 0.6);
                graph.addEdge(ValcoHall, Calc, 1.4);
                graph.addEdge(Calc, SamJonah, 0.55);
                graph.addEdge(Calc, NEC, 0.24);
                graph.addEdge(SamJonah, ScienceMarket, 0.4);
                graph.addEdge(SamJonah, ShuttleTerminal, 0.2);
                graph.addEdge(RoundAbout, SamJonah, 0.7);
                graph.addEdge(RoundAbout, OldSite, 1.4);
                graph.addEdge(WestGate, OldSite, 0.4);
                graph.addEdge(ShuttleTerminal, ScienceMarket, 0.24);
                graph.addEdge(NEC, Code, 0.27);
                graph.addEdge(Code, NLT, 0.35);
                graph.addEdge(NLT, AmissahArthur, 0.6);
                graph.addEdge(AmissahArthur, CongregationalGrounds, 0.45);
                graph.addEdge(CongregationalGrounds, ShuttleTerminal, 0.3);

                graph.addEdge(WestGate, ScienceGate, 1.6);
                graph.addEdge(RoundAbout, ScienceGate, 0.95);
                graph.addEdge(ValcoHall, ScienceGate, 0.5);
                graph.addEdge(RoundAbout, ValcoHall,  0.6);
                graph.addEdge(Calc, ValcoHall,  1.4);
                graph.addEdge(SamJonah, Calc,  0.55);
                graph.addEdge(NEC, Calc, 0.24);
                graph.addEdge(ScienceMarket, SamJonah,  0.4);
                graph.addEdge(ShuttleTerminal, SamJonah,  0.2);
                graph.addEdge(SamJonah, RoundAbout, 0.7);
                graph.addEdge(OldSite, RoundAbout,  1.4);
                graph.addEdge(OldSite, WestGate, 0.4);
                graph.addEdge(ScienceMarket, ShuttleTerminal,  0.24);
                graph.addEdge(Code, NEC,  0.27);
                graph.addEdge(NLT, Code,  0.35);
                graph.addEdge(AmissahArthur, NLT,  0.6);
                graph.addEdge(CongregationalGrounds, AmissahArthur,  0.45);
                graph.addEdge(ShuttleTerminal, CongregationalGrounds, 0.3);


                //System.out.println("Input current location");

                String currentLocation = location;
                switch (currentLocation) {
                    case "Sam Jonah Library":
                        loc1 = SamJonah;
                        break;
                    case "West Gate":
                        loc1 = WestGate;
                        break;
                    case "Amissah Arthur Language Centre":
                        loc1 = AmissahArthur;
                        break;
                    case "Congregational Grounds":
                        loc1 = CongregationalGrounds;
                        break;
                    case "Calc":
                        loc1 = Calc;
                        break;
                    case "Old site":
                        loc1 = OldSite;
                        break;
                    case "NLT Building":
                        loc1 = NLT;
                        break;
                    case "Science Gate":
                        loc1 = ScienceGate;
                        break;
                    case "Valco Hall":
                        loc1 = ValcoHall;
                        break;
                    case "Science Market":
                        loc1 = ScienceMarket;
                        break;
                    case "College of Distance Education":
                        loc1 = Code;
                        break;
                    case "New Examination Center (NEC)":
                        loc1 = NEC;
                        break;
                    case "Round About":
                        loc1 = RoundAbout;
                        break;
                    case "Shuttle Terminal":
                        loc1 = ShuttleTerminal;
                        break;

                }


                String whereTo = destination;

                switch (whereTo) {
                    case "Sam Jonah Library":
                        loc2 = SamJonah;
                        break;
                    case "West Gate":
                        loc2 = WestGate;
                        break;
                    case "Amissah Arthur Language Centre":
                        loc2 = AmissahArthur;
                        break;
                    case "Congregational Grounds":
                        loc2 = CongregationalGrounds;
                        break;
                    case "Calc":
                        loc2 = Calc;
                        break;
                    case "Old site":
                        loc2 = OldSite;
                        break;
                    case "NLT Building":
                        loc2 = NLT;
                        break;
                    case "Science Gate":
                        loc2 = ScienceGate;
                        break;
                    case "Valco Hall":
                        loc2 = ValcoHall;
                        break;
                    case "Science Market":
                        loc2 = ScienceMarket;
                        break;
                    case "College of Distance Education":
                        loc2 = Code;
                        break;
                    case "New Examination Center (NEC)":
                        loc2 = NEC;
                        break;
                    case "Round About":
                        loc2 = RoundAbout;
                        break;
                    case "Shuttle Terminal":
                        loc2 = ShuttleTerminal;
                        break;
                }

                String path = graph.shortestPath(loc1, loc2);
                outputBox1.setText("From: "+ loc1.name);
                outputBox2.setText("To: "+ loc2.name);

                    JOptionPane optionPane = new JOptionPane(path, JOptionPane.INFORMATION_MESSAGE);
                    JDialog dialog = optionPane.createDialog("The Shortest Path");
                    dialog.setAlwaysOnTop(true);
                    dialog.setVisible(true);

            }
        });
    }

    public static void main(String[] args) {
        showMain();
    }

    public  static  void showMain()
    {
        getFrame().setContentPane(new Main().rootPanel);
        getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getFrame().pack();
        getFrame().setLocationRelativeTo(null);
        getFrame().setResizable(true);
        getFrame().setVisible(true);
        frame.setSize(900, 600);
    }
}

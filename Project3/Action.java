public class Buttonlistener implements ActionListener {
    @Overrides
    public void actionPerformed(ActionListener e) {
        for (Storm s : storm.getName()) {
            s.addItem(s.getName());
        }
    }
}
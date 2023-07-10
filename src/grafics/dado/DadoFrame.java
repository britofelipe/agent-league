package grafics.dado;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class DadoFrame extends JFrame {
    private JLabel label;
    private JButton d6, d8, d10, d12, d20;
    private JPanel panel;

    public DadoFrame() {
        setTitle("Rolagem de dados");
        setSize(400, 400);
        setLayout(new BorderLayout());

        label = new JLabel("Qual dado você deseja rolar?", SwingConstants.CENTER);
        d6 = new JButton("D6");
        d8 = new JButton("D8");
        d10 = new JButton("D10");
        d12 = new JButton("D12");
        d20 = new JButton("D20");
        panel = new JPanel();
        panel.setLayout(new GridLayout(1, 5));

        d6.addActionListener(new RollDiceActionListener(6));
        d8.addActionListener(new RollDiceActionListener(8));
        d10.addActionListener(new RollDiceActionListener(10));
        d12.addActionListener(new RollDiceActionListener(12));
        d20.addActionListener(new RollDiceActionListener(20));

        panel.add(d6);
        panel.add(d8);
        panel.add(d10);
        panel.add(d12);
        panel.add(d20);
        add(label, BorderLayout.NORTH);
        add(panel, BorderLayout.CENTER);

        setVisible(true);
    }

    class RollDiceActionListener implements ActionListener {
        private int sides;

        RollDiceActionListener(int sides) {
            this.sides = sides;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Random random = new Random();
            int roll = random.nextInt(sides) + 1;
            label.setText("Você rolou " + roll);
        }
    }
}

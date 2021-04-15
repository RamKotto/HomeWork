package lesson8;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;


public class CounterApp extends JFrame{
    private int value;
    private int saveOrSet = 1;
    private int copyOfValue;

    public CounterApp(int initialValue) {
        setBounds(300, 200, 300, 300);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("Arial", Font.BOLD, 32);

        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);

        value = initialValue;
        counterValueView.setText(String.valueOf(value));

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);

        // Кнопка сброса значения (Домашняя работа)
        JButton resetValue = new JButton("Reset value");
        resetValue.setFont(font);
        add(resetValue, BorderLayout.NORTH);

        // Кнопка сохранения предыдущего значения (как в калькуляторе).
        // Кнопка должна запоминать текущее значение и при повторном
        // нажатии обновлять существующее значение счётчика.
        JButton saveOrSetButton = new JButton("Save / Set");
        saveOrSetButton.setFont(font);
        add(saveOrSetButton, BorderLayout.SOUTH);

        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value--;
                counterValueView.setText(String.valueOf(value));
            }
        });

        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value++;
                counterValueView.setText(String.valueOf(value));
            }
        });

        // Кнопка сброса значения (Домашняя работа)
        resetValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                value = 0;
                counterValueView.setText(String.valueOf(value));
            }
        });

        // Кнопка сохранения предыдущего значения (как в калькуляторе).
        // Кнопка должна запоминать текущее значение и при повторном
        // нажатии обновлять существующее значение счётчика.
        saveOrSetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (saveOrSet % 2 != 0) {
                    copyOfValue = value;
                } else {
                    counterValueView.setText(String.valueOf(copyOfValue));
                    value = copyOfValue;
                }
                saveOrSet++;
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(0);
    }
}

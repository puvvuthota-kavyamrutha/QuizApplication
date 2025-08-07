/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quizapllication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.FontMetrics;

/**
 *
 * @author chinm
 */
public class QuizTest extends JFrame implements  ActionListener{
    private static final long serialVersionUID = 1L;

	JLabel label;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnNext, btnResult;
	ButtonGroup bg;
	int count = 0, current = 0, x = 1, y = 1, now = 0;
	int m[] = new int[10];

	// create jFrame with radioButton and JButton
	QuizTest(String s) {
		super(s);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for (int i = 0; i < 5; i++) {
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnNext = new JButton("Next");
		btnResult = new JButton("Result");
                btnResult.setVisible(false);
		btnNext.addActionListener(this);
		btnResult.addActionListener(this);
		add(btnNext);
		add(btnResult);
		set();
		label.setBounds(30, 40, 700, 20);
		//radioButton[0].setBounds(50, 80, 200, 20);
		radioButton[0].setBounds(50, 80, 1000, 30);
		radioButton[1].setBounds(50, 110, 1000, 30);
		radioButton[2].setBounds(50, 140, 1000, 30);
		radioButton[3].setBounds(50, 170, 1000, 30);
		btnNext.setBounds(100, 240, 100, 30);
		btnResult.setBounds(270, 240, 100, 30);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setLocation(250, 100);
		setVisible(true);
		setSize(600, 350);
	}

	// handle all actions based on event

    /**
     *
     * @param e
     */
    @Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnNext) {
			if (check())
				count = count + 1;
			current++;
			set();
			if (current == 9) {
				btnNext.setEnabled(false);
                                btnResult.setVisible(true);
				btnResult.setText("Result");
			}
		}

		if (e.getActionCommand().equals("Result")) {
			if (check())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this, "correct answers= " + count);
			System.exit(0);
		}
	}

	// SET Questions with options
	void set() {
		radioButton[4].setSelected(true);
		if (current == 0) {
			label.setText("1:  What is the parent class of all Java classes?");
			radioButton[0].setText("Base");
			radioButton[1].setText("Super");
			radioButton[2].setText("Main");
			radioButton[3].setText("Object");
		}
		if (current == 1) {
			label.setText("2:  Which of the following is NOT a primitive data type in Java?");
			radioButton[0].setText("int");
			radioButton[1].setText("double");
			radioButton[2].setText("String");
			radioButton[3].setText("boolean");
		}
		if (current == 2) {
			label.setText("3: Which keyword is used to create a subclass in Java?");
			radioButton[0].setText("inherits");
			radioButton[1].setText("implements");
			radioButton[2].setText("extends");
			radioButton[3].setText("subclass");
		}
		if (current == 3) {
			label.setText("4: What is used to hide internal details of an object?");
			radioButton[0].setText("Inheritance");
			radioButton[1].setText("Abstraction");
			radioButton[2].setText("Polymorphism");
			radioButton[3].setText("Overloading");
		}
		if (current == 4) {
			label.setText("5: Output of the following code? int x = 10; System.out.println(x++);");
			radioButton[0].setText("10");
			radioButton[1].setText("11");
			radioButton[2].setText("9");
			radioButton[3].setText("Compile error");
		}
		if (current == 5) {
			label.setText("6: What is the default value of a boolean variable?");
			radioButton[0].setText("1");
			radioButton[1].setText("true");
			radioButton[2].setText("false");
			radioButton[3].setText("null");
		}
		if (current == 6) {
			label.setText("7:  Which type of exception must be handled in a Java method signature?");
			radioButton[0].setText("RuntimeException");
			radioButton[1].setText("IOException");
			radioButton[2].setText("NullPointerException");
			radioButton[3].setText("ArithmeticException");
		}
		if (current == 7) {
			label.setText("8:  How can you prevent a method from being overridden in a subclass?");
			radioButton[0].setText("Using the static");
			radioButton[1].setText("Using the private");
			radioButton[2].setText("Using the final");
			radioButton[3].setText("Using the protected");
		}
		if (current == 8) {
			label.setText("9: What is the extension of Java bytecode files?");
			radioButton[0].setText(".java");
			radioButton[1].setText(".txt");
			radioButton[2].setText(".class");
			radioButton[3].setText(".exe");
		}
		if (current == 9) {
			label.setText("10: Which loop structure is guaranteed to \nexecute at least once?");
			radioButton[0].setText("for loop");
			radioButton[1].setText("while loop");
			radioButton[2].setText("do-while loop");
			radioButton[3].setText("for each loop");
		}
		label.setBounds(30, 40, 450, 20);
		for (int i = 0, j = 0; i <= 90; i += 30, j++)
			radioButton[j].setBounds(50, 80 + i, 200, 20);
	}

	// declare right answers.
	boolean check() {
		if (current == 0)
			return (radioButton[3].isSelected());
		if (current == 1)
			return (radioButton[2].isSelected());
		if (current == 2)
			return (radioButton[2].isSelected());
		if (current == 3)
			return (radioButton[1].isSelected());
		if (current == 4)
			return (radioButton[0].isSelected());
		if (current == 5)
			return (radioButton[2].isSelected());
		if (current == 6)
			return (radioButton[1].isSelected());
		if (current == 7)
			return (radioButton[2].isSelected());
		if (current == 8)
			return (radioButton[2].isSelected());
		if (current == 9)
			return (radioButton[2].isSelected());
		return false;
	}

	public static void main(String s[]) {
        QuizTest quizTest = new QuizTest("Simple Quiz App");
	}
    
}

package com.crjj.form;

import javax.swing.JOptionPane;

import com.crjj.metier.BookMetier;
import com.crjj.metier.IMerier;
import com.crjj.model.Books;
import com.raven.cell.CellAction;
import com.raven.cell.CellDate;
import com.raven.cell.CellInt;
import com.raven.cell.CellString;
import com.raven.cell.Celltext;
import com.raven.model.ModelBooks;

public class FormBooks extends javax.swing.JPanel {

	public FormBooks() {
		initComponents();
		setOpaque(false);
		table1.addTableStyle(jScrollPane1);
		initDataTable();
	}

	private void initDataTable() {
		table1.addTableCell(new CellString("Isbn"), 0);
		table1.addTableCell(new CellString("Title"), 1);
		table1.addTableCell(new CellInt("Page Count"), 2);
		table1.addTableCell(new CellDate("Published Date"), 3);
		table1.addTableCell(new Celltext("Description"), 4);
		table1.addTableCell(new CellAction("Books"), 5);
		metier.getAll().stream()
		.forEach(book -> table1.addRow(new ModelBooks(book), false));

		table1.getColumnModel().getColumn(0).setWidth(5);
		table1.getColumnModel().getColumn(1).setWidth(5);
		table1.getColumnModel().getColumn(2).setWidth(5);
		table1.getColumnModel().getColumn(3).setWidth(5);
		table1.getColumnModel().getColumn(4).setWidth(150);
		table1.getColumnModel().getColumn(5).setWidth(20);
	}

	@SuppressWarnings("unchecked")
	private void initComponents() {

		roundPanel1 = new com.raven.swing.RoundPanel();
		roundPanel2 = new com.raven.swing.RoundPanel();
		jScrollPane1 = new javax.swing.JScrollPane();
		table1 = new com.raven.swing.Table();

		roundPanel1.setBackground(new java.awt.Color(60, 60, 60));

		javax.swing.GroupLayout roundPanel1Layout = new javax.swing.GroupLayout(roundPanel1);
		roundPanel1.setLayout(roundPanel1Layout);
        roundPanel1Layout.setHorizontalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap())
        );
        roundPanel1Layout.setVerticalGroup(
            roundPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundPanel1Layout.createSequentialGroup()
                .addContainerGap())
        );

		roundPanel2.setBackground(new java.awt.Color(60, 60, 60));

		table1.setModel(new javax.swing.table.DefaultTableModel(new Object[][] {

		}, new String[] { "Isbn", "Title", "Page Count", "Published Date", "Description","" }));
		jScrollPane1.setViewportView(table1);

		javax.swing.GroupLayout roundPanel2Layout = new javax.swing.GroupLayout(roundPanel2);
		roundPanel2.setLayout(roundPanel2Layout);
		roundPanel2Layout.setHorizontalGroup(roundPanel2Layout
				.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(roundPanel2Layout
						.createSequentialGroup().addContainerGap().addComponent(jScrollPane1).addContainerGap()));
		roundPanel2Layout
				.setVerticalGroup(roundPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(roundPanel2Layout.createSequentialGroup().addContainerGap()
								.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
								.addContainerGap()));

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
		this.setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addComponent(roundPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE)
				.addComponent(roundPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
						Short.MAX_VALUE));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup()
						.addComponent(roundPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED).addComponent(roundPanel2,
								javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
								Short.MAX_VALUE)));
	}

	private javax.swing.JScrollPane jScrollPane1;
	private com.raven.swing.RoundPanel roundPanel1;
	private com.raven.swing.RoundPanel roundPanel2;
	private com.raven.swing.Table table1;
	private IMerier<Books> metier = new BookMetier();
}

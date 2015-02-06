package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


	public class StockWatch implements EntryPoint{

		/**
		 ** Layout Objects 
		 **/
		private VerticalPanel mainPanel = new VerticalPanel();
		private FlexTable stockTable = new FlexTable();
		private HorizontalPanel addPanel = new HorizontalPanel();
		private TextBox newSymbolBox = new TextBox();
		private Button addStockButton = new Button("Add");
		private Label lastUpdatedLabel = new Label();
		
		/**
		 **   ENTRY POINT
		 **/
		
		
		public void onModuleLoad() {
			 // TODO Create table for stock data.
			
			stockTable.setText(0, 0, "Symbol");
			stockTable.setText(0, 1, "Price");
			stockTable.setText(0, 2, "Change");
			stockTable.setText(0, 3, "remove");
			
		    // TODO Assemble Add Stock panel.
			
			addPanel.add(newSymbolBox);
			addPanel.add(addStockButton);
			
		    // TODO Assemble Main panel.
			
			mainPanel.add(stockTable);
			mainPanel.add(addPanel);
			mainPanel.add(lastUpdatedLabel);
			
		    // TODO Associate the Main panel with the HTML host page.
		   
			RootPanel.get("stocklist").add(mainPanel);
			
			// TODO Move cursor focus to the input box.
			
			newSymbolBox.setFocus(true);
		}
		
		
		
	}
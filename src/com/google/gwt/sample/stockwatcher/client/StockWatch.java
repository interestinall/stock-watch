package com.google.gwt.sample.stockwatcher.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.VerticalPanel;


	public class StockWatch implements EntryPoint{

		private VerticalPanel mainPanel = new VerticalPanel();
		private FlexTable stockTable = new FlexTable();
		private HorizontalPanel addPanel = new HorizontalPanel();
		private TextBox newSymbolBox = new TextBox();
		private Button addStockButton = new Button("Add");
		private Label lastUpdatedLabel = new Label();
		
		/**
		 *  ENTRY POINT
		 */
		
		
		public void onModuleLoad() {
			 // TODO Create table for stock data.
		    // TODO Assemble Add Stock panel.
		    // TODO Assemble Main panel.
		    // TODO Associate the Main panel with the HTML host page.
		    // TODO Move cursor focus to the input box.
		}
		
		
		
	}
/*
 * Copyright 2014 by the Metanome project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.uni_potsdam.hpi.metanome.frontend.client;

import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;


/**
 * @author Claudia Exeler
 *
 */
public class TabWrapper extends VerticalPanel {

	protected VerticalPanel errorPanel;
	protected TabContent contentPanel;
		
	public TabWrapper(TabContent panel) {
		this.contentPanel = panel;
		this.contentPanel.setErrorReceiver(this);
		this.add(this.contentPanel);
		
		this.errorPanel = new VerticalPanel();
		this.add(this.errorPanel);
	}
	
	public void addError(String message) {
		this.errorPanel.add(new Label(message));
	}
	
	public void clearErrors(){
		this.errorPanel.clear();
	}
}

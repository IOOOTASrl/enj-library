/*
 * EnJ - EnOcean Java API
 * 
 * Copyright 2014 Andrea Biasi, Dario Bonino 
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
 * limitations under the License
 */
package it.polito.elite.enocean.examples;

import java.util.logging.Logger;

import it.polito.elite.enocean.enj.eep.EEPAttribute;
import it.polito.elite.enocean.enj.eep.EEPAttributeChangeListener;
import it.polito.elite.enocean.enj.eep.eep26.attributes.EEP26PowerMeasurement;

/**
 * @author bonino
 *
 */
public class SimplePowerListener implements EEPAttributeChangeListener
{
	private Logger logger;

	/**
	 * 
	 */
	public SimplePowerListener()
	{
		this.logger = Logger.getLogger(SimplePowerListener.class.getName());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see it.polito.elite.enocean.enj.eep.EEPAttributeChangeListener#
	 * handleAttributeChange(int, it.polito.elite.enocean.enj.eep.EEPAttribute)
	 */
	@Override
	public void handleAttributeChange(int channelId, EEPAttribute<?> attribute)
	{
		if (attribute instanceof EEP26PowerMeasurement)
		{
			this.logger.info("Received power: "
					+ ((EEP26PowerMeasurement) attribute).getValue() + " "
					+ ((EEP26PowerMeasurement) attribute).getUnit());
		}

	}

}

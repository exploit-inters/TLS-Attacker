/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS.
 *
 * Copyright (C) 2015 Juraj Somorovsky
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package de.rub.nds.tlsattacker.tls.config.converters;

import com.beust.jcommander.IStringConverter;
import com.beust.jcommander.ParameterException;
import java.math.BigInteger;

/**
 * Converts a string to a BigInteger. If the string starts with '0x', the value
 * is considered to be hexadecimal (for command line purposes).
 * 
 * @author Juraj Somorovsky <juraj.somorovsky@rub.de>
 */
public class BigIntegerConverter implements IStringConverter<BigInteger> {

    @Override
    public BigInteger convert(String value) {

	try {
	    if (value.startsWith("0x")) {
		return new BigInteger(value.substring(2), 16);
	    } else {
		return new BigInteger(value);
	    }
	} catch (IllegalArgumentException e) {
	    throw new ParameterException("Value " + value + " cannot be converted to a BigInteger. "
		    + "The value can be hexadecimal (starting with 0x) or decimal.");
	}
    }
}
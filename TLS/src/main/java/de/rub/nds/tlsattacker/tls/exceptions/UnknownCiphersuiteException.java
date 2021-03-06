/**
 * TLS-Attacker - A Modular Penetration Testing Framework for TLS
 *
 * Copyright 2014-2016 Ruhr University Bochum / Hackmanit GmbH
 *
 * Licensed under Apache License 2.0
 * http://www.apache.org/licenses/LICENSE-2.0
 */
package de.rub.nds.tlsattacker.tls.exceptions;

/**
 * Unknown cipher suite exception
 * 
 * @author Juraj Somorovsky <juraj.somorovsky@rub.de>
 */
public class UnknownCiphersuiteException extends RuntimeException {

    public UnknownCiphersuiteException() {
	super();
    }

    public UnknownCiphersuiteException(String message) {
	super(message);
    }

    public UnknownCiphersuiteException(String message, Throwable cause) {
	super(message, cause);
    }
}

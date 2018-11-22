/*
 * generated by Xtext 2.15.0
 */
package org.xtext.parser.antlr;

import com.google.inject.Inject;
import org.eclipse.xtext.parser.antlr.AbstractAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.xtext.parser.antlr.internal.InternalDaogen2Parser;
import org.xtext.services.Daogen2GrammarAccess;

public class Daogen2Parser extends AbstractAntlrParser {

	@Inject
	private Daogen2GrammarAccess grammarAccess;

	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	

	@Override
	protected InternalDaogen2Parser createParser(XtextTokenStream stream) {
		return new InternalDaogen2Parser(stream, getGrammarAccess());
	}

	@Override 
	protected String getDefaultRuleName() {
		return "Daogen";
	}

	public Daogen2GrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}

	public void setGrammarAccess(Daogen2GrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
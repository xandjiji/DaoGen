/*
 * generated by Xtext 2.15.0
 */
grammar InternalDaogen2;

options {
	superClass=AbstractInternalAntlrParser;
}

@lexer::header {
package org.xtext.parser.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}

@parser::header {
package org.xtext.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.services.Daogen2GrammarAccess;

}

@parser::members {

 	private Daogen2GrammarAccess grammarAccess;

    public InternalDaogen2Parser(TokenStream input, Daogen2GrammarAccess grammarAccess) {
        this(input);
        this.grammarAccess = grammarAccess;
        registerRules(grammarAccess.getGrammar());
    }

    @Override
    protected String getFirstRuleName() {
    	return "Daogen";
   	}

   	@Override
   	protected Daogen2GrammarAccess getGrammarAccess() {
   		return grammarAccess;
   	}

}

@rulecatch {
    catch (RecognitionException re) {
        recover(input,re);
        appendSkippedTokens();
    }
}

// Entry rule entryRuleDaogen
entryRuleDaogen returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDaogenRule()); }
	iv_ruleDaogen=ruleDaogen
	{ $current=$iv_ruleDaogen.current; }
	EOF;

// Rule Daogen
ruleDaogen returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				newCompositeNode(grammarAccess.getDaogenAccess().getElementsTypeParserRuleCall_0());
			}
			lv_elements_0_0=ruleType
			{
				if ($current==null) {
					$current = createModelElementForParent(grammarAccess.getDaogenRule());
				}
				add(
					$current,
					"elements",
					lv_elements_0_0,
					"org.xtext.Daogen2.Type");
				afterParserOrEnumRuleCall();
			}
		)
	)*
;

// Entry rule entryRuleType
entryRuleType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getTypeRule()); }
	iv_ruleType=ruleType
	{ $current=$iv_ruleType.current; }
	EOF;

// Rule Type
ruleType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getTypeAccess().getDataTypeParserRuleCall_0());
		}
		this_DataType_0=ruleDataType
		{
			$current = $this_DataType_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getTypeAccess().getClasseParserRuleCall_1());
		}
		this_Classe_1=ruleClasse
		{
			$current = $this_Classe_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleDataType
entryRuleDataType returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDataTypeRule()); }
	iv_ruleDataType=ruleDataType
	{ $current=$iv_ruleDataType.current; }
	EOF;

// Rule DataType
ruleDataType returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='datatype'
		{
			newLeafNode(otherlv_0, grammarAccess.getDataTypeAccess().getDatatypeKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getDataTypeRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_2=';'
		{
			newLeafNode(otherlv_2, grammarAccess.getDataTypeAccess().getSemicolonKeyword_2());
		}
	)
;

// Entry rule entryRuleClasse
entryRuleClasse returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getClasseRule()); }
	iv_ruleClasse=ruleClasse
	{ $current=$iv_ruleClasse.current; }
	EOF;

// Rule Classe
ruleClasse returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='class'
		{
			newLeafNode(otherlv_0, grammarAccess.getClasseAccess().getClassKeyword_0());
		}
		(
			(
				lv_name_1_0=RULE_ID
				{
					newLeafNode(lv_name_1_0, grammarAccess.getClasseAccess().getNameIDTerminalRuleCall_1_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getClasseRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_1_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		(
			otherlv_2='extends'
			{
				newLeafNode(otherlv_2, grammarAccess.getClasseAccess().getExtendsKeyword_2_0());
			}
			(
				(
					{
						if ($current==null) {
							$current = createModelElement(grammarAccess.getClasseRule());
						}
					}
					otherlv_3=RULE_ID
					{
						newLeafNode(otherlv_3, grammarAccess.getClasseAccess().getSuperTypeClasseCrossReference_2_1_0());
					}
				)
			)
		)?
		otherlv_4='{'
		{
			newLeafNode(otherlv_4, grammarAccess.getClasseAccess().getLeftCurlyBracketKeyword_3());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getClasseAccess().getFeaturesFeatureParserRuleCall_4_0());
				}
				lv_features_5_0=ruleFeature
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getClasseRule());
					}
					add(
						$current,
						"features",
						lv_features_5_0,
						"org.xtext.Daogen2.Feature");
					afterParserOrEnumRuleCall();
				}
			)
		)*
		otherlv_6='}'
		{
			newLeafNode(otherlv_6, grammarAccess.getClasseAccess().getRightCurlyBracketKeyword_5());
		}
	)
;

// Entry rule entryRuleFeature
entryRuleFeature returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getFeatureRule()); }
	iv_ruleFeature=ruleFeature
	{ $current=$iv_ruleFeature.current; }
	EOF;

// Rule Feature
ruleFeature returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getFeatureAccess().getAtributoParserRuleCall_0());
		}
		this_Atributo_0=ruleAtributo
		{
			$current = $this_Atributo_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getFeatureAccess().getInsertCodeParserRuleCall_1());
		}
		this_InsertCode_1=ruleInsertCode
		{
			$current = $this_InsertCode_1.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleAtributo
entryRuleAtributo returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtributoRule()); }
	iv_ruleAtributo=ruleAtributo
	{ $current=$iv_ruleAtributo.current; }
	EOF;

// Rule Atributo
ruleAtributo returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='private'
		{
			newLeafNode(otherlv_0, grammarAccess.getAtributoAccess().getPrivateKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getAtributoAccess().getTypeTypeCrossReference_1_0());
				}
			)
		)
		(
			(
				lv_name_2_0=RULE_ID
				{
					newLeafNode(lv_name_2_0, grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_2_0());
				}
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtributoRule());
					}
					setWithLastConsumed(
						$current,
						"name",
						lv_name_2_0,
						"org.eclipse.xtext.common.Terminals.ID");
				}
			)
		)
		otherlv_3=';'
		{
			newLeafNode(otherlv_3, grammarAccess.getAtributoAccess().getSemicolonKeyword_3());
		}
	)
;

// Entry rule entryRuleInsertCode
entryRuleInsertCode returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInsertCodeRule()); }
	iv_ruleInsertCode=ruleInsertCode
	{ $current=$iv_ruleInsertCode.current; }
	EOF;

// Rule InsertCode
ruleInsertCode returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='insertCode'
		{
			newLeafNode(otherlv_0, grammarAccess.getInsertCodeAccess().getInsertCodeKeyword_0());
		}
		otherlv_1='('
		{
			newLeafNode(otherlv_1, grammarAccess.getInsertCodeAccess().getLeftParenthesisKeyword_1());
		}
		(
			(
				{
					newCompositeNode(grammarAccess.getInsertCodeAccess().getParametroParametroParserRuleCall_2_0());
				}
				lv_parametro_2_0=ruleParametro
				{
					if ($current==null) {
						$current = createModelElementForParent(grammarAccess.getInsertCodeRule());
					}
					set(
						$current,
						"parametro",
						lv_parametro_2_0,
						"org.xtext.Daogen2.Parametro");
					afterParserOrEnumRuleCall();
				}
			)
		)
		otherlv_3=')'
		{
			newLeafNode(otherlv_3, grammarAccess.getInsertCodeAccess().getRightParenthesisKeyword_3());
		}
		otherlv_4=';'
		{
			newLeafNode(otherlv_4, grammarAccess.getInsertCodeAccess().getSemicolonKeyword_4());
		}
	)
;

// Entry rule entryRuleParametro
entryRuleParametro returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getParametroRule()); }
	iv_ruleParametro=ruleParametro
	{ $current=$iv_ruleParametro.current; }
	EOF;

// Rule Parametro
ruleParametro returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		{
			newCompositeNode(grammarAccess.getParametroAccess().getInserirObjetoParserRuleCall_0());
		}
		this_InserirObjeto_0=ruleInserirObjeto
		{
			$current = $this_InserirObjeto_0.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParametroAccess().getBuscarObjetoParserRuleCall_1());
		}
		this_BuscarObjeto_1=ruleBuscarObjeto
		{
			$current = $this_BuscarObjeto_1.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParametroAccess().getListarObjetoParserRuleCall_2());
		}
		this_ListarObjeto_2=ruleListarObjeto
		{
			$current = $this_ListarObjeto_2.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParametroAccess().getRemoverObjetoParserRuleCall_3());
		}
		this_RemoverObjeto_3=ruleRemoverObjeto
		{
			$current = $this_RemoverObjeto_3.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParametroAccess().getAtualizarObjetoParserRuleCall_4());
		}
		this_AtualizarObjeto_4=ruleAtualizarObjeto
		{
			$current = $this_AtualizarObjeto_4.current;
			afterParserOrEnumRuleCall();
		}
		    |
		{
			newCompositeNode(grammarAccess.getParametroAccess().getDeletarTabelaParserRuleCall_5());
		}
		this_DeletarTabela_5=ruleDeletarTabela
		{
			$current = $this_DeletarTabela_5.current;
			afterParserOrEnumRuleCall();
		}
	)
;

// Entry rule entryRuleInserirObjeto
entryRuleInserirObjeto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getInserirObjetoRule()); }
	iv_ruleInserirObjeto=ruleInserirObjeto
	{ $current=$iv_ruleInserirObjeto.current; }
	EOF;

// Rule InserirObjeto
ruleInserirObjeto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getInserirObjetoAccess().getInserirObjetoAction_0(),
					$current);
			}
		)
		otherlv_1='inserir_objeto'
		{
			newLeafNode(otherlv_1, grammarAccess.getInserirObjetoAccess().getInserir_objetoKeyword_1());
		}
	)
;

// Entry rule entryRuleBuscarObjeto
entryRuleBuscarObjeto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getBuscarObjetoRule()); }
	iv_ruleBuscarObjeto=ruleBuscarObjeto
	{ $current=$iv_ruleBuscarObjeto.current; }
	EOF;

// Rule BuscarObjeto
ruleBuscarObjeto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='buscar_objeto,'
		{
			newLeafNode(otherlv_0, grammarAccess.getBuscarObjetoAccess().getBuscar_objetoKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getBuscarObjetoRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getBuscarObjetoAccess().getAtrAtributoCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleListarObjeto
entryRuleListarObjeto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getListarObjetoRule()); }
	iv_ruleListarObjeto=ruleListarObjeto
	{ $current=$iv_ruleListarObjeto.current; }
	EOF;

// Rule ListarObjeto
ruleListarObjeto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getListarObjetoAccess().getListarObjetoAction_0(),
					$current);
			}
		)
		otherlv_1='listar_objeto'
		{
			newLeafNode(otherlv_1, grammarAccess.getListarObjetoAccess().getListar_objetoKeyword_1());
		}
	)
;

// Entry rule entryRuleRemoverObjeto
entryRuleRemoverObjeto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getRemoverObjetoRule()); }
	iv_ruleRemoverObjeto=ruleRemoverObjeto
	{ $current=$iv_ruleRemoverObjeto.current; }
	EOF;

// Rule RemoverObjeto
ruleRemoverObjeto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='remover_objeto,'
		{
			newLeafNode(otherlv_0, grammarAccess.getRemoverObjetoAccess().getRemover_objetoKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getRemoverObjetoRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getRemoverObjetoAccess().getAtrAtributoCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleAtualizarObjeto
entryRuleAtualizarObjeto returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getAtualizarObjetoRule()); }
	iv_ruleAtualizarObjeto=ruleAtualizarObjeto
	{ $current=$iv_ruleAtualizarObjeto.current; }
	EOF;

// Rule AtualizarObjeto
ruleAtualizarObjeto returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		otherlv_0='atualizar_objeto,'
		{
			newLeafNode(otherlv_0, grammarAccess.getAtualizarObjetoAccess().getAtualizar_objetoKeyword_0());
		}
		(
			(
				{
					if ($current==null) {
						$current = createModelElement(grammarAccess.getAtualizarObjetoRule());
					}
				}
				otherlv_1=RULE_ID
				{
					newLeafNode(otherlv_1, grammarAccess.getAtualizarObjetoAccess().getAtrAtributoCrossReference_1_0());
				}
			)
		)
	)
;

// Entry rule entryRuleDeletarTabela
entryRuleDeletarTabela returns [EObject current=null]:
	{ newCompositeNode(grammarAccess.getDeletarTabelaRule()); }
	iv_ruleDeletarTabela=ruleDeletarTabela
	{ $current=$iv_ruleDeletarTabela.current; }
	EOF;

// Rule DeletarTabela
ruleDeletarTabela returns [EObject current=null]
@init {
	enterRule();
}
@after {
	leaveRule();
}:
	(
		(
			{
				$current = forceCreateModelElement(
					grammarAccess.getDeletarTabelaAccess().getDeletarTabelaAction_0(),
					$current);
			}
		)
		otherlv_1='deletar_tabela'
		{
			newLeafNode(otherlv_1, grammarAccess.getDeletarTabelaAccess().getDeletar_tabelaKeyword_1());
		}
	)
;

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;

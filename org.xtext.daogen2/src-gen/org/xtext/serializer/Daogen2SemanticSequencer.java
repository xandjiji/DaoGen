/*
 * generated by Xtext 2.15.0
 */
package org.xtext.serializer;

import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.xtext.daogen2.Atributo;
import org.xtext.daogen2.AtualizarObjeto;
import org.xtext.daogen2.BuscarObjeto;
import org.xtext.daogen2.Classe;
import org.xtext.daogen2.Daogen;
import org.xtext.daogen2.Daogen2Package;
import org.xtext.daogen2.DataType;
import org.xtext.daogen2.DeletarTabela;
import org.xtext.daogen2.InserirObjeto;
import org.xtext.daogen2.InsertCode;
import org.xtext.daogen2.ListarObjeto;
import org.xtext.daogen2.RemoverObjeto;
import org.xtext.services.Daogen2GrammarAccess;

@SuppressWarnings("all")
public class Daogen2SemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private Daogen2GrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == Daogen2Package.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case Daogen2Package.ATRIBUTO:
				sequence_Atributo(context, (Atributo) semanticObject); 
				return; 
			case Daogen2Package.ATUALIZAR_OBJETO:
				sequence_AtualizarObjeto(context, (AtualizarObjeto) semanticObject); 
				return; 
			case Daogen2Package.BUSCAR_OBJETO:
				sequence_BuscarObjeto(context, (BuscarObjeto) semanticObject); 
				return; 
			case Daogen2Package.CLASSE:
				sequence_Classe(context, (Classe) semanticObject); 
				return; 
			case Daogen2Package.DAOGEN:
				sequence_Daogen(context, (Daogen) semanticObject); 
				return; 
			case Daogen2Package.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case Daogen2Package.DELETAR_TABELA:
				sequence_DeletarTabela(context, (DeletarTabela) semanticObject); 
				return; 
			case Daogen2Package.INSERIR_OBJETO:
				sequence_InserirObjeto(context, (InserirObjeto) semanticObject); 
				return; 
			case Daogen2Package.INSERT_CODE:
				sequence_InsertCode(context, (InsertCode) semanticObject); 
				return; 
			case Daogen2Package.LISTAR_OBJETO:
				sequence_ListarObjeto(context, (ListarObjeto) semanticObject); 
				return; 
			case Daogen2Package.REMOVER_OBJETO:
				sequence_RemoverObjeto(context, (RemoverObjeto) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     Feature returns Atributo
	 *     Atributo returns Atributo
	 *
	 * Constraint:
	 *     (type=[Type|ID] name=ID)
	 */
	protected void sequence_Atributo(ISerializationContext context, Atributo semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Daogen2Package.Literals.ATRIBUTO__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Daogen2Package.Literals.ATRIBUTO__TYPE));
			if (transientValues.isValueTransient(semanticObject, Daogen2Package.Literals.ATRIBUTO__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Daogen2Package.Literals.ATRIBUTO__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtributoAccess().getTypeTypeIDTerminalRuleCall_1_0_1(), semanticObject.eGet(Daogen2Package.Literals.ATRIBUTO__TYPE, false));
		feeder.accept(grammarAccess.getAtributoAccess().getNameIDTerminalRuleCall_2_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parametro returns AtualizarObjeto
	 *     AtualizarObjeto returns AtualizarObjeto
	 *
	 * Constraint:
	 *     atr=[Atributo|ID]
	 */
	protected void sequence_AtualizarObjeto(ISerializationContext context, AtualizarObjeto semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Daogen2Package.Literals.ATUALIZAR_OBJETO__ATR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Daogen2Package.Literals.ATUALIZAR_OBJETO__ATR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getAtualizarObjetoAccess().getAtrAtributoIDTerminalRuleCall_1_0_1(), semanticObject.eGet(Daogen2Package.Literals.ATUALIZAR_OBJETO__ATR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parametro returns BuscarObjeto
	 *     BuscarObjeto returns BuscarObjeto
	 *
	 * Constraint:
	 *     atr=[Atributo|ID]
	 */
	protected void sequence_BuscarObjeto(ISerializationContext context, BuscarObjeto semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Daogen2Package.Literals.BUSCAR_OBJETO__ATR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Daogen2Package.Literals.BUSCAR_OBJETO__ATR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getBuscarObjetoAccess().getAtrAtributoIDTerminalRuleCall_1_0_1(), semanticObject.eGet(Daogen2Package.Literals.BUSCAR_OBJETO__ATR, false));
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Type returns Classe
	 *     Classe returns Classe
	 *
	 * Constraint:
	 *     (name=ID superType=[Classe|ID]? features+=Feature*)
	 */
	protected void sequence_Classe(ISerializationContext context, Classe semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Daogen returns Daogen
	 *
	 * Constraint:
	 *     elements+=Type+
	 */
	protected void sequence_Daogen(ISerializationContext context, Daogen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Type returns DataType
	 *     DataType returns DataType
	 *
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(ISerializationContext context, DataType semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Daogen2Package.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Daogen2Package.Literals.TYPE__NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parametro returns DeletarTabela
	 *     DeletarTabela returns DeletarTabela
	 *
	 * Constraint:
	 *     {DeletarTabela}
	 */
	protected void sequence_DeletarTabela(ISerializationContext context, DeletarTabela semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parametro returns InserirObjeto
	 *     InserirObjeto returns InserirObjeto
	 *
	 * Constraint:
	 *     {InserirObjeto}
	 */
	protected void sequence_InserirObjeto(ISerializationContext context, InserirObjeto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Feature returns InsertCode
	 *     InsertCode returns InsertCode
	 *
	 * Constraint:
	 *     parametro=Parametro
	 */
	protected void sequence_InsertCode(ISerializationContext context, InsertCode semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Daogen2Package.Literals.INSERT_CODE__PARAMETRO) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Daogen2Package.Literals.INSERT_CODE__PARAMETRO));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getInsertCodeAccess().getParametroParametroParserRuleCall_2_0(), semanticObject.getParametro());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Parametro returns ListarObjeto
	 *     ListarObjeto returns ListarObjeto
	 *
	 * Constraint:
	 *     {ListarObjeto}
	 */
	protected void sequence_ListarObjeto(ISerializationContext context, ListarObjeto semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Parametro returns RemoverObjeto
	 *     RemoverObjeto returns RemoverObjeto
	 *
	 * Constraint:
	 *     atr=[Atributo|ID]
	 */
	protected void sequence_RemoverObjeto(ISerializationContext context, RemoverObjeto semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, Daogen2Package.Literals.REMOVER_OBJETO__ATR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, Daogen2Package.Literals.REMOVER_OBJETO__ATR));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getRemoverObjetoAccess().getAtrAtributoIDTerminalRuleCall_1_0_1(), semanticObject.eGet(Daogen2Package.Literals.REMOVER_OBJETO__ATR, false));
		feeder.finish();
	}
	
	
}

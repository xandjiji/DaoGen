/**
 * generated by Xtext 2.15.0
 */
package org.xtext.daogen2.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.xtext.daogen2.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Daogen2FactoryImpl extends EFactoryImpl implements Daogen2Factory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static Daogen2Factory init()
  {
    try
    {
      Daogen2Factory theDaogen2Factory = (Daogen2Factory)EPackage.Registry.INSTANCE.getEFactory(Daogen2Package.eNS_URI);
      if (theDaogen2Factory != null)
      {
        return theDaogen2Factory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new Daogen2FactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Daogen2FactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case Daogen2Package.DAOGEN: return createDaogen();
      case Daogen2Package.TYPE: return createType();
      case Daogen2Package.DATA_TYPE: return createDataType();
      case Daogen2Package.CLASSE: return createClasse();
      case Daogen2Package.FEATURE: return createFeature();
      case Daogen2Package.ATRIBUTO: return createAtributo();
      case Daogen2Package.INSERT_CODE: return createInsertCode();
      case Daogen2Package.PARAMETRO: return createParametro();
      case Daogen2Package.INSERIR_OBJETO: return createInserirObjeto();
      case Daogen2Package.BUSCAR_OBJETO: return createBuscarObjeto();
      case Daogen2Package.LISTAR_OBJETO: return createListarObjeto();
      case Daogen2Package.REMOVER_OBJETO: return createRemoverObjeto();
      case Daogen2Package.ATUALIZAR_OBJETO: return createAtualizarObjeto();
      case Daogen2Package.DELETAR_TABELA: return createDeletarTabela();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Daogen createDaogen()
  {
    DaogenImpl daogen = new DaogenImpl();
    return daogen;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Type createType()
  {
    TypeImpl type = new TypeImpl();
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DataType createDataType()
  {
    DataTypeImpl dataType = new DataTypeImpl();
    return dataType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Classe createClasse()
  {
    ClasseImpl classe = new ClasseImpl();
    return classe;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Feature createFeature()
  {
    FeatureImpl feature = new FeatureImpl();
    return feature;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Atributo createAtributo()
  {
    AtributoImpl atributo = new AtributoImpl();
    return atributo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InsertCode createInsertCode()
  {
    InsertCodeImpl insertCode = new InsertCodeImpl();
    return insertCode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Parametro createParametro()
  {
    ParametroImpl parametro = new ParametroImpl();
    return parametro;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InserirObjeto createInserirObjeto()
  {
    InserirObjetoImpl inserirObjeto = new InserirObjetoImpl();
    return inserirObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public BuscarObjeto createBuscarObjeto()
  {
    BuscarObjetoImpl buscarObjeto = new BuscarObjetoImpl();
    return buscarObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ListarObjeto createListarObjeto()
  {
    ListarObjetoImpl listarObjeto = new ListarObjetoImpl();
    return listarObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RemoverObjeto createRemoverObjeto()
  {
    RemoverObjetoImpl removerObjeto = new RemoverObjetoImpl();
    return removerObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AtualizarObjeto createAtualizarObjeto()
  {
    AtualizarObjetoImpl atualizarObjeto = new AtualizarObjetoImpl();
    return atualizarObjeto;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DeletarTabela createDeletarTabela()
  {
    DeletarTabelaImpl deletarTabela = new DeletarTabelaImpl();
    return deletarTabela;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Daogen2Package getDaogen2Package()
  {
    return (Daogen2Package)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static Daogen2Package getPackage()
  {
    return Daogen2Package.eINSTANCE;
  }

} //Daogen2FactoryImpl
/**
 * generated by Xtext 2.15.0
 */
package org.xtext.daogen2;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Daogen</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.daogen2.Daogen#getElements <em>Elements</em>}</li>
 * </ul>
 *
 * @see org.xtext.daogen2.Daogen2Package#getDaogen()
 * @model
 * @generated
 */
public interface Daogen extends EObject
{
  /**
   * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
   * The list contents are of type {@link org.xtext.daogen2.Type}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Elements</em>' containment reference list.
   * @see org.xtext.daogen2.Daogen2Package#getDaogen_Elements()
   * @model containment="true"
   * @generated
   */
  EList<Type> getElements();

} // Daogen

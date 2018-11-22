/**
 * generated by Xtext 2.15.0
 */
package org.xtext.validation;

import org.eclipse.xtext.validation.Check;
import org.xtext.daogen2.Atributo;
import org.xtext.daogen2.Classe;
import org.xtext.daogen2.Daogen2Package;
import org.xtext.validation.AbstractDaogen2Validator;

/**
 * This class contains custom validation rules.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class Daogen2Validator extends AbstractDaogen2Validator {
  @Check
  public void checkNomeComecaComMaiusculo(final Classe classe) {
    boolean _isUpperCase = Character.isUpperCase(classe.getName().charAt(0));
    boolean _not = (!_isUpperCase);
    if (_not) {
      this.warning("O nome da classe deve come�ar com letra mai�scula", 
        Daogen2Package.Literals.TYPE__NAME);
    }
  }
  
  @Check
  public void checkNomeTem16CharMax(final Classe classe) {
    int _length = classe.getName().length();
    boolean _greaterThan = (_length > 16);
    if (_greaterThan) {
      this.warning("O nome da classe deve ter no m�ximo 16 caracteres", 
        Daogen2Package.Literals.TYPE__NAME);
    }
  }
  
  @Check
  public void checkAtributoComecaComMinusculo(final Atributo atributo) {
    boolean _isLowerCase = Character.isLowerCase(atributo.getName().charAt(0));
    boolean _not = (!_isLowerCase);
    if (_not) {
      this.warning("O nome do atributo deve come�ar com letra min�scula", 
        Daogen2Package.Literals.TYPE__NAME);
    }
  }
}

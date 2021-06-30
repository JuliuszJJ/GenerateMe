/**
 * generated by Xtext 2.20.0
 */
package uk.juliusz.generateme.generateMe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getConfig <em>Config</em>}</li>
 *   <li>{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getHomePage <em>Home Page</em>}</li>
 *   <li>{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getPages <em>Pages</em>}</li>
 * </ul>
 *
 * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getGenerateMeProgram()
 * @model
 * @generated
 */
public interface GenerateMeProgram extends EObject
{
  /**
   * Returns the value of the '<em><b>Config</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Config</em>' containment reference.
   * @see #setConfig(Config)
   * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getGenerateMeProgram_Config()
   * @model containment="true"
   * @generated
   */
  Config getConfig();

  /**
   * Sets the value of the '{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getConfig <em>Config</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Config</em>' containment reference.
   * @see #getConfig()
   * @generated
   */
  void setConfig(Config value);

  /**
   * Returns the value of the '<em><b>Home Page</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Home Page</em>' containment reference.
   * @see #setHomePage(HomePage)
   * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getGenerateMeProgram_HomePage()
   * @model containment="true"
   * @generated
   */
  HomePage getHomePage();

  /**
   * Sets the value of the '{@link uk.juliusz.generateme.generateMe.GenerateMeProgram#getHomePage <em>Home Page</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Home Page</em>' containment reference.
   * @see #getHomePage()
   * @generated
   */
  void setHomePage(HomePage value);

  /**
   * Returns the value of the '<em><b>Pages</b></em>' containment reference list.
   * The list contents are of type {@link uk.juliusz.generateme.generateMe.Pages}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pages</em>' containment reference list.
   * @see uk.juliusz.generateme.generateMe.GenerateMePackage#getGenerateMeProgram_Pages()
   * @model containment="true"
   * @generated
   */
  EList<Pages> getPages();

} // GenerateMeProgram

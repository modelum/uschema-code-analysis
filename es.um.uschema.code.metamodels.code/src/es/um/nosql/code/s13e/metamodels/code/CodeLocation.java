/**
 */
package es.um.nosql.code.s13e.metamodels.code;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Location</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeLocation#getLine <em>Line</em>}</li>
 *   <li>{@link es.um.nosql.code.s13e.metamodels.code.CodeLocation#getColumn <em>Column</em>}</li>
 * </ul>
 *
 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeLocation()
 * @model
 * @generated
 */
public interface CodeLocation extends EObject
{
	/**
	 * Returns the value of the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Line</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Line</em>' attribute.
	 * @see #setLine(int)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeLocation_Line()
	 * @model
	 * @generated
	 */
	int getLine();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.CodeLocation#getLine <em>Line</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Line</em>' attribute.
	 * @see #getLine()
	 * @generated
	 */
	void setLine(int value);

	/**
	 * Returns the value of the '<em><b>Column</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Column</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Column</em>' attribute.
	 * @see #setColumn(int)
	 * @see es.um.nosql.code.s13e.metamodels.code.CodePackage#getCodeLocation_Column()
	 * @model
	 * @generated
	 */
	int getColumn();

	/**
	 * Sets the value of the '{@link es.um.nosql.code.s13e.metamodels.code.CodeLocation#getColumn <em>Column</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Column</em>' attribute.
	 * @see #getColumn()
	 * @generated
	 */
	void setColumn(int value);

} // CodeLocation

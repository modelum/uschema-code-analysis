/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import es.um.uschema.code.metamodels.code.Code;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.CodeGraph#getCode <em>Code</em>}</li>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.CodeGraph#getSubGrahps <em>Sub Grahps</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getCodeGraph()
 * @model
 * @generated
 */
public interface CodeGraph extends EObject {
	/**
	 * Returns the value of the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code</em>' reference.
	 * @see #setCode(Code)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getCodeGraph_Code()
	 * @model
	 * @generated
	 */
	Code getCode();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.CodeGraph#getCode <em>Code</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code</em>' reference.
	 * @see #getCode()
	 * @generated
	 */
	void setCode(Code value);

	/**
	 * Returns the value of the '<em><b>Sub Grahps</b></em>' containment reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.codeGraph.CodeSubGraph}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Grahps</em>' containment reference list.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getCodeGraph_SubGrahps()
	 * @model containment="true"
	 * @generated
	 */
	EList<CodeSubGraph> getSubGrahps();

} // CodeGraph

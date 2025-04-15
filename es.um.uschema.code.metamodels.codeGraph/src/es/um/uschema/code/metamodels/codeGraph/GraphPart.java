/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import es.um.uschema.code.metamodels.code.Variable;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Graph Part</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.GraphPart#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getGraphPart()
 * @model abstract="true"
 * @generated
 */
public interface GraphPart extends EObject {
	/**
	 * Returns the value of the '<em><b>Variables</b></em>' reference list.
	 * The list contents are of type {@link es.um.uschema.code.metamodels.code.Variable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' reference list.
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getGraphPart_Variables()
	 * @model
	 * @generated
	 */
	EList<Variable> getVariables();

} // GraphPart

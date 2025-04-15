/**
 */
package es.um.uschema.code.metamodels.codeGraph;

import es.um.uschema.code.metamodels.code.CodeBlock;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Code Block Sub Graph</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph#getCodeBlock <em>Code Block</em>}</li>
 * </ul>
 *
 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getCodeBlockSubGraph()
 * @model
 * @generated
 */
public interface CodeBlockSubGraph extends CodeSubGraph {
	/**
	 * Returns the value of the '<em><b>Code Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Code Block</em>' reference.
	 * @see #setCodeBlock(CodeBlock)
	 * @see es.um.uschema.code.metamodels.codeGraph.CodeGraphPackage#getCodeBlockSubGraph_CodeBlock()
	 * @model
	 * @generated
	 */
	CodeBlock getCodeBlock();

	/**
	 * Sets the value of the '{@link es.um.uschema.code.metamodels.codeGraph.CodeBlockSubGraph#getCodeBlock <em>Code Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Block</em>' reference.
	 * @see #getCodeBlock()
	 * @generated
	 */
	void setCodeBlock(CodeBlock value);

} // CodeBlockSubGraph

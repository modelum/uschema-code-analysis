package es.um.nosql.code.s13e.transfs.dboschema2code.transf.builders;

import java.util.List;

import es.um.nosql.code.s13e.metamodels.code.Argument;
import es.um.nosql.code.s13e.metamodels.code.Call;
import es.um.nosql.code.s13e.metamodels.code.CallableBlock;
import es.um.nosql.code.s13e.metamodels.code.CodeBlockType;
import es.um.nosql.code.s13e.metamodels.code.CodeFactory;
import es.um.nosql.code.s13e.metamodels.code.DataContainer;
import es.um.nosql.code.s13e.metamodels.code.DataProducer;
import es.um.nosql.code.s13e.metamodels.code.IndexBasedAccess;
import es.um.nosql.code.s13e.metamodels.code.Literal;
import es.um.nosql.code.s13e.metamodels.code.NewDataContainer;
import es.um.nosql.code.s13e.metamodels.code.Parameter;
import es.um.nosql.code.s13e.metamodels.code.Property;
import es.um.nosql.code.s13e.metamodels.code.PropertyAccess;
import es.um.nosql.code.s13e.metamodels.code.Variable;
import es.um.nosql.code.s13e.metamodels.code.VariableAccess;

public class CodeBuilder
{
	private CodeFactory codeFactory;
	
	public CodeBuilder()
	{
		this.codeFactory = CodeFactory.eINSTANCE;
	}

	public PropertyAccess createNewPropertyAccess(PropertyAccess propertyAccess, VariableAccess variableAccess, String propertyName)
	{
		Property newProperty = createNewProperty(propertyAccess, propertyName);
		
		PropertyAccess newPropertyAccess = codeFactory.createPropertyAccess();
		newPropertyAccess.setName(newProperty.getName());
		newPropertyAccess.setProperty(newProperty);
		newPropertyAccess.setDataProducer(variableAccess);
		propertyAccess.setDataProducer(newPropertyAccess);
		
		return newPropertyAccess;
	}

	public PropertyAccess createNewPropertyAccess(IndexBasedAccess indexBasedAccess, VariableAccess variableAccess, String propertyName)
	{
		PropertyAccess newPropertyAccess = codeFactory.createPropertyAccess();
		newPropertyAccess.setName(propertyName);
		newPropertyAccess.setDataProducer(variableAccess);
		indexBasedAccess.setDataProducer(newPropertyAccess);
		
		return newPropertyAccess;
	}

	public IndexBasedAccess createNewIndexBasedAccess(PropertyAccess propertyAccess, String propertyName, String literalValue)
	{
		Literal literal = codeFactory.createLiteral();
		literal.setLiteral(literalValue);
		
		IndexBasedAccess indexBasedAccess = codeFactory.createIndexBasedAccess();
		indexBasedAccess.setIndex(literal);
		propertyAccess.setDataProducer(indexBasedAccess);
		
		return indexBasedAccess;
	}

	public PropertyAccess createNewPropertyAccess(String propertyName)
	{
		Property newProperty = createNewProperty(propertyName);
		
		PropertyAccess newPropertyAccess = codeFactory.createPropertyAccess();
		newPropertyAccess.setName(newProperty.getName());
		newPropertyAccess.setProperty(newProperty);
		
		return newPropertyAccess;
	}

	public Property createNewProperty(PropertyAccess propertyAccess, String propertyName)
	{
		Property newProperty = codeFactory.createProperty();
		newProperty.setName(propertyName);
		DataContainer dataContainer = (DataContainer) propertyAccess.getProperty().eContainer();
		dataContainer.getProperties().add(newProperty);
		
		return newProperty;
	}

	public Property createNewProperty(String propertyName)
	{
		Property newProperty = codeFactory.createProperty();
		newProperty.setName(propertyName);
		
		return newProperty;
	}


	public Argument createNewArgument(List<Property> targetDataContainer)
	{
		Argument newArgument = codeFactory.createArgument();
		
		DataContainer dataContainer = codeFactory.createDataContainer();
		targetDataContainer.forEach(p -> p.setDataContainer(dataContainer));
		dataContainer.getProperties().addAll(targetDataContainer);
		
		NewDataContainer newDataContainer = codeFactory.createNewDataContainer();
		newDataContainer.setDataContainer(dataContainer);
		
		newArgument.setDataProducer(newDataContainer);
		return newArgument;
	}

	public VariableAccess createVariableAccess(Variable variable)
	{
		VariableAccess variableAccess = codeFactory.createVariableAccess();
		variableAccess.setVariable(variable);
		variableAccess.setName(variable.getName());
		
		return variableAccess;
	}

	public PropertyAccess createPropertyAccess(DataProducer dataProducer, String name)
	{
		PropertyAccess propertyAccess = codeFactory.createPropertyAccess();
		propertyAccess.setName(name);
		propertyAccess.setDataProducer(dataProducer);
		
		return propertyAccess;
	}

	public CallableBlock createArrowFunction(String name, Parameter newParameter)
	{
		CallableBlock arrowFunction = codeFactory.createCallableBlock();
		arrowFunction.setCodeBlockType(CodeBlockType.LAMBDA);
		arrowFunction.setName(name);
		arrowFunction.getParameters().add(newParameter);
		arrowFunction.getVariables().add(newParameter);
		
		return arrowFunction;
	}

	public Parameter createParameter(String parameterName)
	{
		Parameter parameter = codeFactory.createParameter();
		parameter.setName(parameterName);
		
		return parameter;
	}

	public Call createInnerCall(PropertyAccess dataProducer, CallableBlock container, String name)
	{
		Call innerCall = codeFactory.createCall();
		innerCall.setName(name);
		innerCall.setDataProducer(dataProducer);
		
		Argument argument = codeFactory.createArgument();
		argument.setDataProducer(container);
		innerCall.getArguments().add(argument);
		
		return innerCall;
	}
	
}

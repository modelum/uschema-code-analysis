package es.um.nosql.code.s13e.transfs.json2code.transf.analyzers;

import es.um.nosql.code.s13e.transfs.json2code.transf.builders.BlockBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.StatementBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.arrays.ArrayExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.breakstatement.BreakBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.exceptions.CatchBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.exceptions.ThrowBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.exceptions.TryBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions.BinaryExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions.ExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions.LogicalExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions.UnaryExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.expressions.UpdateExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions.ArrowFunctionExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions.CallExpression;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions.FunctionDeclarationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions.FunctionExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.functions.ReturnBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.ifstatement.IfBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.literals.LiteralBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.loops.ForBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.loops.While;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects.ClassDeclarationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects.MemberExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects.MethodBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects.NewExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects.ObjectExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.objects.ThisExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.switchstatement.SwitchBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.loops.DoWhile;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables.AssignmentExpressionBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables.IdentifierBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables.VariableDeclarationBuilder;
import es.um.nosql.code.s13e.transfs.json2code.transf.builders.variables.VariableDeclaratorBuilder;

public enum CodeType {

	FunctionDeclaration 	{ @Override public StatementBuilder getBuilder() { return new FunctionDeclarationBuilder(); }},
	BlockStatement 			{ @Override public StatementBuilder getBuilder() { return new BlockBuilder(); }},
	Program 				{ @Override public StatementBuilder getBuilder() { return new BlockBuilder(); }},
	ClassBody 				{ @Override public StatementBuilder getBuilder() { return new BlockBuilder(); }},
	VariableDeclaration 	{ @Override public StatementBuilder getBuilder() { return new VariableDeclarationBuilder(); }},
	VariableDeclarator 		{ @Override public StatementBuilder getBuilder() { return new VariableDeclaratorBuilder(); }},
	Literal 				{ @Override public StatementBuilder getBuilder() { return new LiteralBuilder(); }},
	ReturnStatement 		{ @Override public StatementBuilder getBuilder() { return new ReturnBuilder(); }},
	ForStatement 			{ @Override public StatementBuilder getBuilder() { return new ForBuilder(); }},
	BinaryExpression 		{ @Override public StatementBuilder getBuilder() { return new BinaryExpressionBuilder(); }},
	Identifier 				{ @Override public StatementBuilder getBuilder() { return new IdentifierBuilder(); }},
	UpdateExpression 		{ @Override public StatementBuilder getBuilder() { return new UpdateExpressionBuilder(); }},
	UnaryExpression 		{ @Override public StatementBuilder getBuilder() { return new UnaryExpressionBuilder(); }},
	ExpressionStatement 	{ @Override public StatementBuilder getBuilder() { return new ExpressionBuilder(); }},
	LogicalExpression 		{ @Override public StatementBuilder getBuilder() { return new LogicalExpressionBuilder(); }},
	AssignmentExpression 	{ @Override public StatementBuilder getBuilder() { return new AssignmentExpressionBuilder(); }},
	CallExpression 			{ @Override public StatementBuilder getBuilder() { return new CallExpression(); }},
	IfStatement 			{ @Override public StatementBuilder getBuilder() { return new IfBuilder(); }},
	WhileStatement 			{ @Override public StatementBuilder getBuilder() { return new While(); }},
	DoWhileStatement 		{ @Override public StatementBuilder getBuilder() { return new DoWhile(); }},
	ObjectExpression 		{ @Override public StatementBuilder getBuilder() { return new ObjectExpressionBuilder(); }},
	MemberExpression 		{ @Override public StatementBuilder getBuilder() { return new MemberExpressionBuilder(); }},
	SwitchStatement 		{ @Override public StatementBuilder getBuilder() { return new SwitchBuilder(); }},
	BreakStatement 			{ @Override public StatementBuilder getBuilder() { return new BreakBuilder(); }},
	FunctionExpression 		{ @Override public StatementBuilder getBuilder() { return new FunctionExpressionBuilder(); }},
	ArrowFunctionExpression { @Override public StatementBuilder getBuilder() { return new ArrowFunctionExpressionBuilder(); }},
	ArrayExpression 		{ @Override public StatementBuilder getBuilder() { return new ArrayExpressionBuilder(); }},
	ThrowStatement 			{ @Override public StatementBuilder getBuilder() { return new ThrowBuilder(); }},
	TryStatement 			{ @Override public StatementBuilder getBuilder() { return new TryBuilder(); }},
	CatchClause				{ @Override public StatementBuilder getBuilder() { return new CatchBuilder(); }},
	ClassDeclaration 		{ @Override public StatementBuilder getBuilder() { return new ClassDeclarationBuilder(); }},
	NewExpression 			{ @Override public StatementBuilder getBuilder() { return new NewExpressionBuilder(); }},
	MethodDefinition		{ @Override public StatementBuilder getBuilder() { return new MethodBuilder(); }},
	ThisExpression			{ @Override public StatementBuilder getBuilder() { return new ThisExpressionBuilder(); }}
	;
	
    public abstract StatementBuilder getBuilder();
	
}

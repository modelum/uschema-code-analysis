package es.um.nosql.code.s13e.transfs.codegraph2dboschema.transf.constants;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConstantsDBSchema
{
	public static final String FIND_ONE = "findOne";
	public static final String FIND = "find";
	public static final String INSERT_ONE = "insertOne";
	public static final String INSERT = "insert";
	public static final String DELETE_ONE = "deleteOne";
	public static final String DELETE = "delete";
	public static final String FIND_ONE_UPDATE_ONE = "findOneAndUpdate";
	public static final String UPDATE = "update";
	public static final String AGGREGATE = "aggregate";
	
	public static final List<String> NAMES = Stream.of(
			FIND_ONE, FIND,
			INSERT_ONE, INSERT,
			DELETE_ONE, DELETE,
			FIND_ONE_UPDATE_ONE, UPDATE,
			AGGREGATE
		).collect(Collectors.toList());
	
}

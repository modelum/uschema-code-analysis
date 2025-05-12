# Automated Extraction and Refactoring of NoSQL Schemas from Application Code

This repository contains the implementation of a code analysis framework to infer NoSQL database schemas and generate refactoring plans from application source code. Produces logical schemas conforming to the [U-Schema metamodel](https://github.com/modelum/uschema).

## Overview

`uschema-code-analysis` analyzes the source code of data-intensive applications built with JavaScript and MongoDB to extract:

- CRUD operations and their target containers.
- Implicit references between data entities.
- Logical schema models (U-Schema).
- Join query removal candidates via duplication plans.

The approach is designed to support schema discovery in schemaless NoSQL databases, improve query performance, and assist in database refactoring through code and data rewriting.

## Features

- Code metamodel.
- Control flow metamodel.
- Database operation and Structure metamodel.
- Extraction of U-Schema logical schemas from code.
- Generation of join query removal plans.
- Automated schema, data, and code updates.
- Graph visualization for control flow analysis using Neo4j.

## Dependencies

This project relies on the following tools and libraries:
- **[Esprima](https://esprima.org/)** – A high-performance ECMAScript parser used to generate the Abstract Syntax Tree (AST) from JavaScript source code.

This project depend on the U-Schema core projects that are found in:
- **[U-Schema repository](https://github.com/modelum/uschema)** - U-Schema Metamodel and Utils.
```bash
$ git clone https://github.com/modelum/uschema
```



List of related publications:

* Carlos J. Fernández-Candel, Anthony Cleve, Jesús García-Molina, [**Automated Extraction and Refactoring of NoSQL Schemas from Application Code**](#). arXiv. 
— The APP used to validate the approach (music-app) in the paper can be found in "es.um.uschema.code.transfs.launcher" under the folder "inputs".

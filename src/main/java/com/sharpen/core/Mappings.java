/* Copyright (C) 2009  Versant Inc.   http://www.db4o.com */
package com.sharpen.core;

import org.eclipse.jdt.core.dom.*;

import com.sharpen.core.Configuration.*;

public interface Mappings {

	String mappedFieldName(IVariableBinding binding);

	String mappedTypeName(ITypeBinding type);

	String mappedMethodName(IMethodBinding binding);

	MemberMapping effectiveMappingFor(IMethodBinding binding);

}

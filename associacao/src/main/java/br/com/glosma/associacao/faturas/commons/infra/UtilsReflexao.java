package br.com.glosma.associacao.faturas.commons.infra;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;

public class UtilsReflexao {
	public static Class<?> getClassOfGenericType(Field field) {
		ParameterizedType listType = (ParameterizedType) field.getGenericType();
		Class<?> retorno = (Class<?>) listType.getActualTypeArguments()[0];
		return retorno;
	}

	public static String obterTextoComPrimeiraLetraMaiuscula(String texto) {
		return texto != null && !texto.equals("") ? texto.substring(0, 1).toUpperCase() + texto.substring(1) : "";
	}

	public static Object invocarMetodoGet(Object objeto, String campo)
			throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		Method methodGet = objeto.getClass().getMethod("get" + obterTextoComPrimeiraLetraMaiuscula(campo));
		Object resultado = methodGet != null ? methodGet.invoke(objeto) : null;
		return resultado;
	}

	public static <T> Method getMethodWithoutParameters(Class<T> clazz, String nomeMethod) {
		Method[] methods = clazz.getMethods();
		for (Method m : methods) {
			if (m.getName().equals(nomeMethod)) {
				return m;
			}
		}
		return null;
	}
}

package com.xworkz.ExceptionalEvents.things;

import java.awt.AWTException;
import java.awt.color.CMMException;
import java.awt.geom.IllegalPathStateException;
import java.awt.image.ImagingOpException;
import java.io.FileNotFoundException;
import java.lang.annotation.AnnotationTypeMismatchException;
import java.lang.annotation.IncompleteAnnotationException;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.nio.channels.AcceptPendingException;
import java.nio.channels.FileLockInterruptionException;
import java.nio.channels.NoConnectionPendingException;
import java.nio.channels.NonWritableChannelException;
import java.nio.channels.UnsupportedAddressTypeException;
import java.nio.charset.UnsupportedCharsetException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.FileSystemAlreadyExistsException;
import java.nio.file.FileSystemLoopException;
import java.nio.file.FileSystemNotFoundException;
import java.nio.file.ProviderNotFoundException;
import java.security.AccessControlException;
import java.security.ProviderException;
import java.util.ConcurrentModificationException;
import java.util.EmptyStackException;
import java.util.IllformedLocaleException;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.MissingResourceException;
import java.util.concurrent.RejectedExecutionException;
import java.util.prefs.BackingStoreException;
import java.util.zip.DataFormatException;
import javax.annotation.processing.FilerException;
import javax.crypto.IllegalBlockSizeException;
import javax.lang.model.type.MirroredTypeException;
import javax.management.IntrospectionException;
import javax.management.JMException;
import javax.management.JMRuntimeException;
import javax.management.MalformedObjectNameException;
import javax.naming.NameNotFoundException;
import javax.naming.NoInitialContextException;
import javax.security.auth.login.AccountExpiredException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.text.ChangedCharSetException;
import javax.xml.datatype.DatatypeConfigurationException;

import org.w3c.dom.DOMException;
import org.w3c.dom.events.EventException;
import org.w3c.dom.ls.LSException;

import com.sun.jdi.AbsentInformationException;
import com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl;
import com.sun.org.apache.xerces.internal.util.DOMErrorHandlerWrapper;

public class Events {

	public void event1() throws IllegalAccessException {
		System.out.println("Running IllegalAccessException");
		throw new IllegalAccessException("error1");
	}

	public void event2() throws BufferOverflowException {
		System.out.println("Running BufferOverflowException");
		throw new BufferOverflowException();
	}

	public void event3() throws BackingStoreException {
		System.out.println("Running BackingStoreException");
		throw new BackingStoreException("error");
	}

	public void event4() throws AbsentInformationException {
		System.out.println("Running AbsentInformationException");
		throw new AbsentInformationException();
	}

	public void event5() throws BufferOverflowException {
		System.out.println("Running BufferOverflowException");
		throw new AcceptPendingException();
	}

	public void event6() throws AcceptPendingException, Throwable {
		System.out.println("Running AcceptPendingException");
		throw new AbsentInformationException();
	}

	public void event7() throws AccessControlException {
		System.out.println("Running AccessControlException");
		throw new AccessControlException("error");
	}

	public void event8() throws FileAlreadyExistsException {
		System.out.println("Running FileAlreadyExistsException");
		throw new FileAlreadyExistsException(null);
	}

	public void event9() throws FileLockInterruptionException {
		System.out.println("Running FileLockInterruptionException");
		throw new FileLockInterruptionException();
	}

	public void event10() throws FileNotFoundException {
		System.out.println("Running FileNotFoundException");
		throw new FileNotFoundException();
	}

	public void event11() throws FilerException {
		System.out.println("Running FilerException");
		throw new FilerException(null);
	}

	public void event12() throws FileSystemAlreadyExistsException {
		System.out.println("Running FileSystemAlreadyExistsException");
		throw new FileSystemAlreadyExistsException();
	}

	public void event13() throws FileSystemLoopException {
		System.out.println("Running FileSystemLoopException");
		throw new FileSystemLoopException(null);
	}

	public void event14() throws AnnotationTypeMismatchException {
		System.out.println("Running AnnotationTypeMismatchException ");
		throw new AnnotationTypeMismatchException(null, null);
	}

	public void event15() throws AcceptPendingException {
		System.out.println("Running AcceptPendingException ");
		throw new AcceptPendingException();
	}

	public void event16() throws AccountExpiredException {
		System.out.println("Running AccountExpiredException");
		throw new AccountExpiredException();
	}

	public void event17() throws IncompleteAnnotationException {
		System.out.println("Running IncompleteAnnotationException");
		throw new IncompleteAnnotationException(null, null);
	}

	public void event18() throws ImagingOpException {
		System.out.println("Running ImagingOpException");
		throw new ImagingOpException(null);
	}

	public void event() throws DataFormatException {
		System.out.println("Running DataFormatException");
		throw new DataFormatException();
	}

	public void event19() throws DatatypeConfigurationException {
		System.out.println("Running DatatypeConfigurationException");
		throw new DatatypeConfigurationException();
	}

	public void event20() throws CMMException {
		System.out.println("Running CMMException");
		throw new CMMException(null);
	}

	public void event21() throws FileSystemAlreadyExistsException {
		System.out.println("Running FileSystemAlreadyExistsException ");
		throw new FileSystemAlreadyExistsException();
	}

	public void event22() throws FileSystemLoopException {
		System.out.println("Running FileSystemLoopException");
		throw new FileSystemLoopException(null);
	}

	public void event23() throws FileSystemNotFoundException {
		System.out.println("Running FileSystemNotFoundException ");
		throw new FileSystemNotFoundException();
	}

	public void event24() throws EmptyStackException {
		System.out.println("Running EmptyStackException ");
		throw new EmptyStackException();
	}

	public void event25() throws DataFormatException {
		System.out.println("Running DataFormatException ");
		throw new DataFormatException();
	}

	public void event26() throws MissingFormatArgumentException {
		System.out.println("Running MissingFormatArgumentException");
		throw new MissingFormatArgumentException(null);
	}

	public void event27() throws MissingFormatWidthException {
		System.out.println("Running MissingFormatWidthException");
		throw new MissingFormatWidthException(null);
	}

	public void event28() throws MissingResourceException {
		System.out.println("Running MissingResourceException ");
		throw new MissingResourceException(null, null, null);
	}

	public void event29() throws BufferOverflowException {
		System.out.println("Running BufferOverflowException");
		throw new BufferOverflowException();
	}

	public void event30() throws BufferUnderflowException {
		System.out.println("Running BufferUnderflowException");
		throw new BufferUnderflowException();
	}

	public void event31() throws UnsupportedAddressTypeException {
		System.out.println("Running UnsupportedAddressTypeException ");
		throw new UnsupportedAddressTypeException();
	}

	public void event32() throws ConcurrentModificationException {
		System.out.println("Running ConcurrentModificationException ");
		throw new ConcurrentModificationException();
	}

	public void event33() throws UnsupportedAddressTypeException {
		System.out.println("Running UnsupportedAddressTypeException");
		throw new UnsupportedAddressTypeException();
	}

	public void event34() throws UnsupportedAudioFileException {
		System.out.println("Running UnsupportedAudioFileException");
		throw new UnsupportedAudioFileException();
	}

	public void event35() throws MalformedObjectNameException {
		System.out.println("Running MalformedObjectNameException");
		throw new MalformedObjectNameException();
	}
	
	public void event36() {
		System.out.println("Running NoClassDefFoundError");
		throw new NoClassDefFoundError();
	}
	
	public void event37()  {
		System.out.println("Running NoConnectionPendingException");
		throw new NoConnectionPendingException();
	}
	public void event38()  {
		System.out.println("Running NonWritableChannelException");
		throw new NonWritableChannelException();
	}
	public void event39()  {
		System.out.println("Running MissingResourceException");
		throw new MissingResourceException(null, null, null);
	}
	public void event40()  {
		System.out.println("Running NoClassDefFoundError ");
		throw new NoClassDefFoundError();
	}
	public void event41()  {
		System.out.println("Running UnsupportedCharsetException");
		throw new UnsupportedCharsetException(null);
	}
	public void event42()  {
		System.out.println("Running ProviderException");
		throw new ProviderException ();
	}
	public void event43()  {
		System.out.println("Running RejectedExecutionException");
		throw new RejectedExecutionException();
	}
	public void event44()  {
		System.out.println("Running MirroredTypeException");
		throw new MirroredTypeException(null);
	}
	public void event45()  {
		System.out.println("Running DOMException ");
		throw new DOMException((short) 1, null);
	}
	public void event46()  {
		System.out.println("Running EmptyStackException ");
		throw new EmptyStackException();
	}
	public void event47()  {
		System.out.println("Running EventException");
		throw new EventException((short) 0, null);
	}
	public void event48()  {
		System.out.println("Running FileSystemAlreadyExistsException");
		throw new FileSystemAlreadyExistsException();
	}
	public void event49()  {
		System.out.println("Running IllegalArgumentException");
		throw new IllegalArgumentException ();
	}
	public void event50()  {
		System.out.println("Running IllegalMonitorStateException ");
		throw new IllegalMonitorStateException ();
	}
	public void event51()  {
		System.out.println("Running IllegalPathStateException ");
		throw new IllegalPathStateException();
	}
	public void event52()  {
		System.out.println("Running IllegalStateException ");
		throw new IllegalStateException();
	}
	public void event53()  {
		System.out.println("Running IllformedLocaleException");
		throw new IllformedLocaleException();
	}
	public void event54()  {
		System.out.println("Running JMRuntimeException");
		throw new JMRuntimeException();
	}
	public void event55()  {
		System.out.println("Running IncompleteAnnotationException");
		throw new IncompleteAnnotationException(null, null);
	}
	public void event56()  {
		System.out.println("Running IndexOutOfBoundsException ");
		throw new IndexOutOfBoundsException();
	}
	public void event57()  {
		System.out.println("Running IllegalStateException ");
		throw new IllegalStateException();
	}
	public void event58()  {
		System.out.println("Running LSException");
		throw new LSException((short) 1, null);
	}
	public void event59() throws AWTException  {
		System.out.println("Running AWTException");
		throw new AWTException(null) ;
	}
	public void event60() throws IntrospectionException  {
		System.out.println("Running IntrospectionException ");
		throw new IntrospectionException();
	}
	
	
	
	
	
	
}

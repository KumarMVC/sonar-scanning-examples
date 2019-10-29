import com.company.CompareToTester;

@Test
public void testDoSomething() {
  MyClass myClass = new MyClass();
  assertNull(myClass.doSomething());  // JUnit assertion
  assertThat(myClass.doSomething()).isNull();  // Fest assertion
}

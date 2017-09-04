/*
 * Copyright 2017 Makoto Consulting Group, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */
package com.makotojava.learn.junit5;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import com.makotojava.learn.junit.Person;

/**
 * Common functionality and other constructs that are shared by
 * test classes.
 * 
 * It's not just a good idea, it's the law! Okay, not really,
 * but it's definitely a good idea.
 * 
 * @author J Steven Perry
 *
 */
public abstract class AbstractBaseTest {

  public static void performPersonAssertions(String lastName, String firstName, int age, String eyeColor, String gender,
      Person person) {
    assertAll(
        () -> assertEquals(firstName, person.getFirstName()),
        () -> assertEquals(lastName, person.getLastName()),
        () -> assertEquals(age, person.getAge()),
        () -> assertEquals(eyeColor.toString(), person.getEyeColor()),
        () -> assertEquals(gender.toString(), person.getGender()));
  }

}

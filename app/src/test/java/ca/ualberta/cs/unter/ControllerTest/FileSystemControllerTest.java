/*
 * Copyright (C) 2016 CMPUT301F16T18 - Alan(Xutong) Zhao, Michael(Zichun) Lin, Stephen Larsen, Yu Zhu, Zhenzhe Xu
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package ca.ualberta.cs.unter.ControllerTest;

import junit.framework.TestCase;

import ca.ualberta.cs.unter.controller.FileSystemController;

/**
 * Test class for FileSystemController
 */
public class FileSystemControllerTest extends TestCase {

	FileSystemController fsc = new FileSystemController();
	@Override
	public void setUp() throws Exception {
		super.setUp();
	}

	/**
	 * Test for save in file
	 */
	public void testSaveInFile() {
		fsc.saveInFile();
	}

	/**
	 * Test for load from file
	 */
	public void testLoadFromFile() {
		fsc.loadFromFile();
	}
}

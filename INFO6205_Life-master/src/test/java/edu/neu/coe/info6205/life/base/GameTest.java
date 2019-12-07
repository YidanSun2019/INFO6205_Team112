package edu.neu.coe.info6205.life.base;

import edu.neu.coe.info6205.life.library.Library;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GameTest {

		@Test
		public void testRunBlip() {
				String patternName = "Blip";
				System.out.println("Game of Life with starting pattern: " + patternName);
				final String pattern = Library.get(patternName);
				final Game.Behavior generations = Game.run(0L, pattern);
				assertEquals(0, generations.generation);
		}

		@Test
		public void testRunBlinker() {
				String patternName = "Blinker";
				System.out.println("Game of Life with starting pattern: " + patternName);
				final String pattern = Library.get(patternName);
				final Game.Behavior generations = Game.run(0L, pattern);
				assertEquals(new Game.Behavior(4, 0, 1), generations);
		}

		@Test
		public void generation() {
				// TODO implement test
		}
		@Test
		public void testFitness1() {
			String str="Block";
			final String pattern = Library.get(str);
			assertEquals(2L, Game.fitness(pattern));
		}
		@Test
		public void testFitness2() {
			String str="Beehive";
			final String pattern = Library.get(str);
			assertEquals(2L, Game.fitness(pattern));
		}
		@Test
		public void testFitness3() {
			String str="Loaf";
			final String pattern = Library.get(str);
			assertEquals(2L, Game.fitness(pattern));
		}
		@Test
		public void testFitness4() {
			String str="Blinker";
			final String pattern = Library.get(str);
			assertEquals(4L, Game.fitness(pattern));
		}
		@Test
		public void testFitness5() {
			String str="Glider1";
			final String pattern = Library.get(str);
			assertEquals(11L, Game.fitness(pattern));
		}
		@Test
		public void testRandom() {
			assertTrue(!Game.RandomString().isEmpty());
		}
}
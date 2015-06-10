import System.Environment
import Data.List

main = do
  [a1, a2, a3] <- getArgs
  let [a, b, c] = [(read a1 :: Float), (read a2 :: Float), (read a3 :: Float)]

  let rotate tri = last tri : init tri
  let angle [x,y,z] = acos ((x**2 + z**2 - y**2)/(2*x*z))
  let angles = map angle $ take 3 $ iterate rotate $ sort [a,b,c]
  print $ decide $ last angles

decide :: Float -> Int
decide angle
  | isNaN angle = 0
  | angle == pi/2 = 2
  | angle > pi/2 = 3
  | angle < pi/3 = 1

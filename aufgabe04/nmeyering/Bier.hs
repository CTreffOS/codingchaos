import System.Environment

bier budget preis = length $ takeWhile (<(floor (budget / preis))) $ scanl1 (+) $ map (^2) [1..]

main = do
  [a1, a2] <- getArgs
  let [b, p] = [(read a1 :: Float), (read a2 :: Float)]
  print $ bier b p

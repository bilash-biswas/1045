package main

import (
	"fmt"
)

func main() {
	var a, b, c, x, y, z float64
	fmt.Scan(&a)
	fmt.Scan(&b)
	fmt.Scan(&c)
	if a > b && a > c {
		if b > c {
			x = a
			y = b
			z = c
		} else {
			x = a
			y = c
			z = b
		}
	} else if b > a && b > c {
		if a > c {
			x = b
			y = a
			z = c
		} else {
			x = b
			y = c
			z = a
		}
	} else if c > a && c > b {
		if a > b {
			x = c
			y = a
			z = b
		} else {
			x = c
			y = b
			z = a
		}
	} else {
		x = a
		y = b
		z = c
	}
	if x >= y+z {
		fmt.Printf("NAO FORMA TRIANGULO\n")
	} else if (x * x) == (y*y + z*z) {
		fmt.Printf("TRIANGULO RETANGULO\n")
	} else if (x * x) > (y*y + z*z) {
		fmt.Printf("TRIANGULO OBTUSANGULO\n")
	} else if (x * x) < (y*y + z*z) {
		fmt.Printf("TRIANGULO ACUTANGULO\n")
	}
	if x == y && x == z && y == z {
		fmt.Printf("TRIANGULO EQUILATERO\n")
	} else if (x == y && x != z) || (x == z && x != y) || (y == z && y != x) || (y == x && y != z) || (z == x && z != y) || (z == y && z != x) {
		fmt.Printf("TRIANGULO ISOSCELES\n")
	}
}

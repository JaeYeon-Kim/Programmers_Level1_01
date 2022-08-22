package com.kjy.programmers_level1_01

fun main() {
    println(solution("01085066515"))
}


fun solution(phone_number: String): String {

        // 빈 문자열 지정
        var answer = ""

        // 전화번호 전체 길이 변수
        var num = phone_number.length

        // 끝 4자리 를 가져옴
        var originNum = phone_number.substring(num - 4 until num)


        // for문을 통해 빈 문자열에 넣어줌
        // 시작부터 전체길이의 - 5까지 반복문 실행
        for (i in 0..num - 5) {
            answer += "*"
        }

        return answer + originNum
    }


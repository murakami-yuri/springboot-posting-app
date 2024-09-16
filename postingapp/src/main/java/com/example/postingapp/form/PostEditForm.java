package com.example.postingapp.form;

import org.hibernate.validator.constraints.Length;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class PostEditForm {
	@NotBlank(message = "タイトルを入力してください。")
	@Length( max = 40, message = "タイトルは最大40文字です。")
    private String title;

    @NotBlank(message = "本文を入力してください。")
    @Length( max = 200, message = "本文は最大200文字です。")
    private String content;
}

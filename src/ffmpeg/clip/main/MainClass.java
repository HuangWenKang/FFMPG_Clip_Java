package ffmpeg.clip.main;

import ffmpeg.clip.process.VideoProcess;

public class MainClass {

	// main method
	public static void main(String[] args) {
		try {
			VideoProcess.convertVideoToClips("full_path_of_video", "output_folder", "process_name", 2, 200);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}

	}

}

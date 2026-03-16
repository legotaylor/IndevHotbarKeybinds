package net.minecraft.client;

public final class KeyBinding {
	public String keyDescription;
	public int keyCode;
	public boolean isKeyboard;

	public KeyBinding(String keyDescription, int keyCode) {
		this(keyDescription, keyCode, true);
	}

	public KeyBinding(String keyDescription, int keyCode, boolean isKeyboard) {
		this.keyDescription = keyDescription;
		this.keyCode = keyCode;
		this.isKeyboard = isKeyboard;
	}

	public boolean hasCode(boolean keyboard) {
		return keyboard ? isKeyboard : !keyboard;
	}
}